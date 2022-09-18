package com.itheima.work4;

public class Cat {
    //属性
    private String color;
    private String breed;

    //空参
    public Cat(){}

    //有参
    public Cat(String color, String breed){
        this.color = color;
        this.breed = breed;
    }

    //get和set
    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void eat(String color, String breed){
        System.out.println(color + breed + "正在吃鱼");
    }

    public void catchMouse(String color, String breed){
        System.out.println(color + breed + "正在逮老鼠");
    }
}
