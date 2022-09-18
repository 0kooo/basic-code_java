package com.itheima.work3;

public class managerAndCoderText {
    public static void main(String[] args) {
        Manager ma = new Manager("张三", 123, 15000, 6000);
        Coder cer = new Coder("李四", 135, 10000);

        ma.work(ma.getName(), ma.getId(), ma.getSalary(), ma.getBonus());

        cer.work(cer.getName(), cer.getId(), cer.getSalary());
    }
}
