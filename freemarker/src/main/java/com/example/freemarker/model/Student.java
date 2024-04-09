package com.example.freemarker.model;

public class Student {
    private Integer id;
    private String name;
    private double grade;

    public Student(Integer id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        id = id;
    }
}
