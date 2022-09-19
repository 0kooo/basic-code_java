package com.itheima.work1;

public class Rectangle extends Shape{
    private double length;
    private double wide;

    public Rectangle() {
    }

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public void getPerimeter() {
        System.out.println("矩形的周长为" + getWide() * getLength());
    }

    @Override
    public void getArea() {
        System.out.println("矩形的面积为" + (getLength() + getWide()) * 2);
    }
}
