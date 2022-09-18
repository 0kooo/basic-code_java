package com.itheima.work1;

public class Student extends Role{
    private String classGrade;

    public Student() {
    }

    public Student(String name, int age, String classGrade) {
        super(name, age);
        this.classGrade = classGrade;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public void fillForm(){
        System.out.println("填写听课反馈");
    }
}
