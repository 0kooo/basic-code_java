package com.itheima.text4;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    private String hobby;

    public GirlFriend(){}

    public GirlFriend(String name, int age, String gender, String hobby){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age >= 18 && age <= 30){
            this.age = age;
        }else{
            System.out.println("年龄赋值错误");
        }
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public String getHobby(){
        return hobby;
    }
}
