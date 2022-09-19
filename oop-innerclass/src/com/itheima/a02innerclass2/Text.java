package com.itheima.a02innerclass2;

public class Text {
    public static void main(String[] args) {
        //创建静态内部类的对象
        //只要是静态的东西,都可以用类名点获得

        //调用非静态方法
        //先创建对象,再用对象去调用
        Outer.Inner io = new Outer.Inner();
        io.show1();

        //调用静态方法
        //外部类名.内部类名.方法名
        Outer.Inner.show2();
    }
}
