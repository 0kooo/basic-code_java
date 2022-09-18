package com.itheima.work2;

public class GirlFriend {
    //属性
    private String name;
    private double height;
    private double weight;

    //空参
    public GirlFriend(){}

    //含参
    public GirlFriend(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    //get和set
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook(){
        System.out.println("女朋友给我做饭");
    }
}
