package com.itheima.a05bigintegerText5;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //1.获取一个随机的大整数
        //范围:[0 ~ 2的numBits次方 - 1]
        Random r = new Random();
        BigInteger bd1 = new BigInteger(4,r);
        System.out.println(bd1);

        //获取一个指定的大整数
        BigInteger bd2 = new BigInteger("100");
        System.out.println(bd2);

        //获取指定进制的大整数
        //参数: 数字 进制
        //细节
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合
        BigInteger bd3 = new BigInteger("123",10);
        System.out.println(bd3);
    }
}
