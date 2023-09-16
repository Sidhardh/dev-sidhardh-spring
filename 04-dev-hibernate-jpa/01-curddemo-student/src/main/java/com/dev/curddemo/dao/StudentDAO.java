package com.dev.curddemo.dao;

import com.dev.curddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student findbyId(Integer id);

    List<Student> findall();

    List<Student> findbyLname(String name);

    Student updateStudent(Student student);

    Student deleteStudent(int id);

    int deleteMultiple(int id);

    int deleteAll();

}
