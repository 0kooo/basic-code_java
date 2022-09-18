package com.itheima.text1;

public class girlFriend {
    //属性
    private String name;
    private int age;
    private String gender;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        if(a >= 18 && a <= 30){
            age = a;
        }else{
            System.out.println("年龄赋值错误");
        }
    }

    public int getAge(){
        return age;
    }

    public void setGender(String g){
        gender = g;
    }

    public String getGender(){
        return gender;
    }

    public void sleep(){
        System.out.println("女朋友在睡觉");
    }

    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
