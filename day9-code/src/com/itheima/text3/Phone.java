package com.itheima.text3;

public class Phone {
    private String brand;
    private int price;
    private String color;

    public Phone(){}

    public Phone(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

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
