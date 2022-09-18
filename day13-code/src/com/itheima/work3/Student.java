package com.itheima.work3;

public class Student extends Person{
    private String StuNumber;
    public static String school;

    public Student() {
    }

    public Student(String name, String gender, int age, String stuNumber) {
        super(name, gender, age);
        StuNumber = stuNumber;
    }

    public String getStuNumber() {
        return StuNumber;
    }

    public void setStuNumber(String stuNumber) {
        StuNumber = stuNumber;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public void work(){
        System.out.println("学生需要学习");
    }
}
