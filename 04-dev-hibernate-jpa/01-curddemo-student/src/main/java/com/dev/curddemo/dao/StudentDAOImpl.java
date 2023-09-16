package com.dev.curddemo.dao;

import com.dev.curddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl  implements StudentDAO{

    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using DI
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //impliment save
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findbyId(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findall() {
        TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student",Student.class);
       // TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student order by lastName desc",Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findbyLname(String name) {
        //typed query
        TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student where lastName=:theStudent",Student.class);
        //set query param
        theQuery.setParameter("theStudent",name);
        //execute and get results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public Student deleteStudent(int id) {
        Student theStudent= entityManager.find(Student.class,id);
        entityManager.remove(theStudent);
        return theStudent;
    }

    @Override
    @Transactional
    public int deleteMultiple(int id) {

        return entityManager.createQuery("DELETE FROM Student where id > "+id).executeUpdate();

    }

    @Override
    @Transactional
    public int deleteAll() {
        return entityManager.createQuery("DELETE FROM Student").executeUpdate();
    }

}
