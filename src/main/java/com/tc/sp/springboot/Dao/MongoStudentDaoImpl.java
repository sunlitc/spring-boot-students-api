package com.tc.sp.springboot.Dao;

import com.tc.sp.springboot.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("MongoData")
public class MongoStudentDaoImpl implements StudentDao{

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>() {
            {
                add(new Student(1, "Mario", "Nothing!"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void addStudent(Student student) {

    }
}
