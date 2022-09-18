package com.itheima.work3;

public class Person {
    private String name;
    private String gender;
    private int age;
    public static String nationality;

    public Person() {
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Person.nationality = nationality;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void work(){
        System.out.println("工作");
    }
}
