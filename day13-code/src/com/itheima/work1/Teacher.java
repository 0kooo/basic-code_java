package com.itheima.work1;

public class Teacher extends Role{
    private String department;

    public Teacher() {
    }

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void pubilshForm(){
        System.out.println("发布问题");
    }
}
