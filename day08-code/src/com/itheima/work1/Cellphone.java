package com.itheima.work1;

public class Cellphone {
    //属性
    private String brand;
    private int price;
    private String color;

    //空参
    public Cellphone(){}

    //有参
    public Cellphone(String brand, int price, String color){
        this.brand =brand;
        this.price = price;
        this.color = color;
    }

    //get和set
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
