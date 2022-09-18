package com.itheima.work4;

public class Text {
    public static void main(String[] args) {
        Manager ma = new Manager("zhangsan", "001", 15000, 5000);
        System.out.println(ma.getName() + ", " + ma.getId() + ", " + ma.getSelery() + ", " + ma.getBonus());
        ma.work();

        Coder cod = new Coder("lisi", "002", 8000);
        System.out.println(cod.getName() + ", " + cod.getId() + ", " + cod.getSelery());
        cod.work();
    }
}
