package com.tc.sp.springboot.Dao;

import com.tc.sp.springboot.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Samir", "CE"));
                put(2, new Student(2, "Aashi", "MBA"));
                put(3, new Student(3, "Pandey", "IT"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    public void deleteStudentById(int id) {
        this.students.remove(id);
    }

    public void updateStudent(Student student) {
        Student s = this.students.get(student.getId());
        s.setName(student.getName());
        s.setCourse(student.getCourse());
        this.students.put(student.getId(), student);
    }

    public void addStudent(Student student) {
        this.students.put(student.getId(), student);
    }
}
