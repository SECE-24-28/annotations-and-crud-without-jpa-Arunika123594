package com.example.springbootcrud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.springbootcrud.model.Student;
import com.example.springbootcrud.service.StudentService;

import static java.awt.AWTEventMulticaster.add;

@RestController
public class StudentController {

    @Autowired
    StudentService s;

    // Get all students
    @GetMapping("/student")
    public List<Student> getAllStudent() {
        return s.getAllStudent();
    }

    // Get student by roll number
    @GetMapping("/student/{rollno}")
    public Student getByStudentRollNo(@PathVariable int rollno) {
        return s.getStudentByRollNo(rollno);
    }
    @PostMapping("students")
    public String addstudent(@RequestBody Student std){
        s.addStudent(std);
        return "SUCCESS";


    }
//    @PutMapping("student/{rollno}")
//    public String updateStudent(@RequestBody Student std){
//        s.updateStudent(std);
//        return "Update successfully"
//    }
}