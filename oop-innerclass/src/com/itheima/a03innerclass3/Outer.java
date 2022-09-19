package com.itheima.a03innerclass3;

public class Outer {
    int b = 10;
    public void show(){

        //局部内部类
        //局部内部类和局部变量是类似的
        class Inner{
            String name;
            int age;

            int a = 20;
            public void method1(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部类内部类的method1方法");
            }

            public static void method2(){
                System.out.println("局部类内部类的method2静态方法");
            }
        }

        //创建局部内部类
        Inner i = new Inner();
        System.out.println(i.age);
        System.out.println(i.name);
        i.method1();
        Inner.method2();
    }
}
