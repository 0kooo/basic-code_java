package com.itheima.a01innerclass1;

public class Text {
    public static void main(String[] args) {
        Outer.Inner io = new Outer().new Inner();

        io.show();
    }

}
