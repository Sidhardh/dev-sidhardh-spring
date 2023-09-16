package com.dev.curddemo;

import com.dev.curddemo.dao.StudentDAO;
import com.dev.curddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CurddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return start -> {
			System.out.println("In Command Line Runner");
			//Creating Single Student
			//createStudent(studentDAO);
			//creating multiple student
			createMultipleStudent(studentDAO);
			//search a student
			//findStudent(studentDAO);
			//list all students
			// queryforStudents(studentDAO);
			//query by lastname
			//queryforStudentslname(studentDAO);
			//Query to update Student
			//updateStudent(studentDAO);
			//removing student id
			//deleteStudentById(studentDAO);
			//deleting students with query
			//deleteStudents(studentDAO);
			//Delete all
			//deleteAllStudents(studentDAO);

		};
	}



	private void createStudent(StudentDAO studentDAO) {
		Student tempStudent = new Student("Fname_1", "Lname_1", "email_1");
		System.out.println("Saved Student : " + tempStudent.getId());
		studentDAO.save(tempStudent);
		System.out.println("Saved Student : " + tempStudent.getId());

	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		for (int i = 0; i < 5; i++) {
			Student tempStudent = new Student("Fname_" + i, "Lname_" + i, "email_" + i);
			studentDAO.save(tempStudent);
			System.out.println("Saved Student : " + tempStudent.getId());
		}
	}

	private void findStudent(StudentDAO studentDAO) {
		//create a student
		Student tempStudent = new Student("Fname_11", "Lname_11", "email_11");
		System.out.println("Saved Student : " + tempStudent.getId());
		//save student
		studentDAO.save(tempStudent);
		//display saved student id
		System.out.println("Saved Student : " + tempStudent.getId());
		//find the id using primary key
		studentDAO.findbyId(tempStudent.getId());
		//display
		System.out.println(studentDAO.findbyId(tempStudent.getId()).toString());
	}

	private void queryforStudents(StudentDAO studentDAO) {
		List<Student> studentList = studentDAO.findall();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	private void queryforStudentslname(StudentDAO studentDAO) {
		List<Student> studentList = studentDAO.findbyLname("Lname_2");
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId=3;
		Student student= studentDAO.findbyId(studentId);
		student.setFirstName("Fname_Update");
		student.setLastName("Lname_Update");
		student.setEmail("Email_update");
		System.out.println(studentDAO.updateStudent(student));
	}
	private void deleteStudentById(StudentDAO studentDAO) {
		int id=1;
		System.out.println(	studentDAO.deleteStudent(id));
	}
	private void deleteStudents(StudentDAO studentDAO)
	{
		System.out.println(studentDAO.deleteMultiple(5));//just deleteing all id's greater than 10
	}

	private void deleteAllStudents(StudentDAO studentDAO)
	{
		System.out.println(studentDAO.deleteAll());
	}
}




