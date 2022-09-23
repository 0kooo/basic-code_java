package com.itheima.a05bigintegerText5;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        //1.创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(15);

        //2.加法,减法,乘法,除法
        /*bd2.add(bd1);
        bd2.subtract(bd1);
        bd2.multiply(bd1);
        bd2.divide(bd1);//取得商
        bd2.divideAndRemainder(bd1);//取得商,和余数*/

        //3.比较两数是否相等
        boolean flag = bd2.equals(bd1);
        System.out.println(flag);

        //4.次幂
        BigInteger bd3 = bd1.pow(2);
        System.out.println(bd3);

        //5.返回较大值或较小值
        BigInteger max = bd2.max(bd1);
        BigInteger min = bd2.min(bd1);
        System.out.println(max);
        System.out.println(min);

        //6.转换为int类型的数据,如果超出则会报错
        int i = bd1.intValue();
        System.out.println(i);

    }
}
