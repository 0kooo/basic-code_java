package com.itheima.a03oopextensText3;

public class Text {
    public static void main(String[] args) {
        Manager mg = new Manager("001", "zhangsan", 10000, 2000);
        System.out.println(mg.getId() + ", " + mg.getName() + ", " + mg.getSelery() + ", " + mg.getBonus());
        mg.work();
        mg.eat();

        Cook ck = new Cook("002", "lisi", 6000);
        System.out.println(ck.getId() + ", " + ck.getName() + ", " + ck.getSelery());
        ck.work();
        ck.eat();
    }
}
