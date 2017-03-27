package com.tc.sp.springboot.Dao;

import com.tc.sp.springboot.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void updateStudent(Student student);

    void addStudent(Student student);
}
