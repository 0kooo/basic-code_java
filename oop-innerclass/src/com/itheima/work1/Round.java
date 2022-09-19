package com.itheima.work1;

public class Round extends Shape{
    private double radius;
    private double PI;

    public Round() {
    }

    public Round(double radius, double PI) {
        this.radius = radius;
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    @Override
    public void getArea() {
         System.out.println("圆的面积为" + getPI() * getRadius() *getRadius());
    }

    @Override
    public void getPerimeter() {
        System.out.println("圆的周长为" + getPI() * getRadius() * 2);
    }
}
