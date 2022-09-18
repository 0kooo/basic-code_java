package com.itheima.work2;

public class Phone {
    private String brand;
    private int price;
    public static int size;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void call(){
        System.out.println("打电话");
    }

    public static void sendMessage(){
        System.out.println("发短信");
    }

    public static void playGame(){
        System.out.println("打游戏");
    }
}
