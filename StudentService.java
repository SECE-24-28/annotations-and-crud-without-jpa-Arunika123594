package com.example.springbootcrud.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import com.example.springbootcrud.model.Student;



@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "john", "sb"),
                    new Student(2, "mith", "react"),
                    new Student(3, "afrin", "java")
            )
    );


    public List<Student> getAllStudent() {
        return students;
    }

    public Student getStudentByRollNo(int roll) {
        int index = 0;

        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollno() == roll) {
                index = i;
                flag = false;
            }
        }
        if (flag) return new Student(0, " ", " ");
        else {
            return students.get(index);
        }

    }

    public void addStudent(Student std) {
        students.add(std);
    }
}

//    public void updateStudent(Student Student std) {
//
//        private int rollno;
//        private int index;
//
//        public List<Student> getAllStudent() {
//            return students;
//        }
//
//        public Student getStudentByRollNo(int roll) {
//
//            boolean flag = false;
//            for(int i = 0; i < students.size(); i++){
//                if(students.get(i).getRollno() == roll){
//                    index = i;
//                    flag = false;
//                }
//            }
//            if(flag)return new Student(0, " ",  " ");
//            else{
//                return students.get(index);
//            }