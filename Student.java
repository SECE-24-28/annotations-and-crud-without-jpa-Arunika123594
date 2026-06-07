package com.example.springbootcrud.model;

public class Student {

    private int rollno;
    private String name;
    private String tech;

    // Parameterized Constructor
    public Student(int rollno, String name, String tech) {
        this.rollno = rollno;
        this.name = name;
        this.tech = tech;
    }

    // Default Constructor
    public Student() {

    }

    // Getters
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getTech() {
        return tech;
    }

    // Setters
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}