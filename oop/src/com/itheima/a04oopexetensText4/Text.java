package com.itheima.a04oopexetensText4;

public class Text {
    public static void main(String[] args) {
        Lecturer lt = new Lecturer("heima001", "zhangsan");
        System.out.println(lt.getId() + ", " + lt.getName());
        lt.work();
        System.out.println("--------------------------------------------------");

        Tutor t = new Tutor("heima002", "lisi");
        System.out.println(t.getId() + ", " + t.getName());
        t.work();
        System.out.println("--------------------------------------------------");

        Maintainer mn = new Maintainer("heima003", "wangwu");
        System.out.println(mn.getId() + ", " + mn.getName());
        mn.work();
        System.out.println("--------------------------------------------------");

        Buyer by = new Buyer("heima004", "zhaoliu");
        System.out.println(by.getId() + ", " + by.getName());
        by.work();

    }
}
