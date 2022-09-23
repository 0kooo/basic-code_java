package com.itheima.a01mathText1;

public class MathDemo1 {
    public static void main(String[] args) {
        //abs   获取参数的绝对值
        int num = Math.abs(-1);
        System.out.println(num);
        System.out.println("------------------------------");

        //ceil  向上取整
        System.out.println(Math.ceil(13.4));
        System.out.println(Math.ceil(-13.4));
        System.out.println("------------------------------");

        //floor 向下取整
        System.out.println(Math.floor(13.4));
        System.out.println(Math.floor(-13.4));
        System.out.println("------------------------------");

        //round 四舍五入
        System.out.println(Math.round(13.4));
        System.out.println(Math.round(13.5));
        System.out.println(Math.round(-13.4));
        System.out.println(Math.round(-13.5));
        System.out.println("------------------------------");

        //max   获取两个数中的最大值
        System.out.println(Math.max(1,2));
        System.out.println(Math.max(-1,-2));
        System.out.println(Math.max(1.2,1.3));
        System.out.println("------------------------------");

        //min   获取两个数中的最小值
        System.out.println(Math.min(1,2));
        System.out.println(Math.min(-1,-2));
        System.out.println(Math.min(1.2,1.3));
        System.out.println("------------------------------");

        //pow   获得a的b次幂
        System.out.println(Math.pow(1,10));
        System.out.println(Math.pow(2,7));
        System.out.println(Math.pow(2,-2));
        //开平方根
        System.out.println(Math.sqrt(4));
        //开立方根
        System.out.println(Math.cbrt(8));
        System.out.println("------------------------------");

        //random    获得随机数 范围值为[0.0 1.0)
        System.out.println(Math.random());
    }
}
