package com.tc.sp.springboot.Controller;

import com.tc.sp.springboot.Entity.Student;
import com.tc.sp.springboot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/")
    public Collection<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return this.studentService.getStudentById(id);
    }

    @GetMapping(value = "/private/")
    public String privateData() {
        return "This is a secured data returned from a secured end point. It can be read only by system admins.";
    }

    @GetMapping(value = "/protected/")
    public String protectedData() {
        return "This is a secured data returned from a secured end point. But it can read by all the authenticated users.";
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStudentById(@PathVariable("id") int id) {
        this.studentService.deleteStudentById(id);
    }

    @PutMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student) {
        this.studentService.updateStudent(student);
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addStudent(@RequestBody Student student) {
        this.studentService.addStudent(student);
    }
}
