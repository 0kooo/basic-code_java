package com.itheima.text2;

public class User {
    //属性
    private String userName;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参
    public User(){

    }

    public User(String userName, String password, String email, String gender, int age){
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //get和set方法
    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setAge(int age){
        if(age >= 19 && age <= 25){
            this.age = age;
        }else{
            System.out.println("年龄输入错误");
        }
    }
    public int getAge(){
        return age;
    }

}
