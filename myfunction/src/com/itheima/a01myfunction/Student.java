package com.itheima.a01myfunction;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String str){
        String[] student = str.split(",");
        this.name = student[0];
        this.age = Integer.parseInt(student[1]);
    }

    public static String newSize(Student s){
        return s.name + "-" + s.age;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
