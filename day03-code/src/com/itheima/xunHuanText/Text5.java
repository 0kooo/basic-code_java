package com.itheima.xunHuanText;

public class Text5 {
    public static void main(String[] args) {
        //1.定义三个变量记录三个和尚的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        //2.拿第一个和尚和第二个和尚进行比较
        //再拿结果跟第三个进行比较即可
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
    }
}
