package com.itheima.text2;

public class User {
    //属性
    private String id;
    private String userName;
    private String password;

    public User(){}

    public User(String id, String userName, String pssword){
        this.id = id;
        this.userName = userName;
        this.password = pssword;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

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
}
