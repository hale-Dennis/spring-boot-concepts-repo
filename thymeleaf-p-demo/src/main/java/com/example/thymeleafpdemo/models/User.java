package com.example.thymeleafpdemo.models;

public class User {

    private Integer id;
    private String GPA;
    private Double grade;
    private String name;

    public User(Integer id, String GPA, Double grade, String name){
        this.id = id;
        this.GPA = GPA;
        this.grade = grade;
        this.name = name;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
