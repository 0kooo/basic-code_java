package com.itheima.a06bigdecimalText6;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //1.通过传递double类型的小数来创建对象
        //细节:
        //这种方式有可能是不精确的,所以不建议使用
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.05);

        //2.通过传递字符串表示的小数来创造对象
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd5);

        //3.通过静态方式获得对象
        BigDecimal bd6 = BigDecimal.valueOf(10);

        //细节:
        //如果要表示的数字不大,没有超出double的取值范围,建议使用静态方法
        //如果要表示的数字比较大,超出了double的取值范围,建议使用构造方法
        //如果我们传递的是0~10之间的整数,包含0,包含10,那么方法会返回已经创建好的对象,不会重新new
    }
}
