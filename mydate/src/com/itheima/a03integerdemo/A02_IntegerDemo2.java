package com.itheima.a03integerdemo;

public class A02_IntegerDemo2 {
    public static void main(String[] args) {
        //1.把整数转换成二进制, 八进制, 十六进制
        String str1 = Integer.toBinaryString(100);
        String str2 = Integer.toOctalString(100);
        String str3 = Integer.toHexString(100);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //2.将字符串类转换成int类
        //强类型语言: 每种数据在java中都有各自的数据类型
        //在计算的时候, 如果不是同一种数据类型, 是无法直接计算
        int int1 = Integer.parseInt(str1);
        System.out.println(int1);

        //细节1:
        //在类型转换的时候, 括号中的参数只能是数字不能是其他,否则代码会报错
        //细节2:
        //8种包装类当中, 除了Character都有对应的parseXXx的方法, 进行类型转换
    }
}
