package com.itheima.a01innerclass1;

public class Outer {
    private int a = 10;
    class Inner{
        private int a = 20;
        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            //Outer.this 就是外部类对象的地址值
            System.out.println(Outer.this.a);
        }
    }
}

