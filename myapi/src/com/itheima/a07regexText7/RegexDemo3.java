package com.itheima.a07regexText7;

public class RegexDemo3 {
    public static void main(String[] args) {
        //用户名: 大小字母,数字,下划线一共4-16位
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));

        //身份证号码的简单校验:
        String regex2 = "[1-9]\\d{16}(x|X|\\d)";
        String regex3 = "[1-9]\\d[16][xX\\d]";
        System.out.println("123123123123123121".matches(regex2));
        System.out.println("123123123123123121".matches(regex3));

        //忽略大小写的书写方式
        String regex4 = "a(?i)bc";
        System.out.println("abc".matches(regex4));//true
        System.out.println("aBC".matches(regex4));//true
        System.out.println("Abc".matches(regex4));//false
        System.out.println("----------------------------------------------");

        //身份证号码的严格校验
        //410801 1993 02 28 457x
        //前6位: 省市, 市区, 派出所等信息   第一位不能是0, 后面5位是任意数字
        //年的前半段: 18 19 20
        //月份:   01 ~ 09 10 11 12
        //日期:   01 ~ 31
        //后面四位:     任意数字出现3次 最后一位可以是数字也可以是大写X或是小写x
        String regex5 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|30|31)\\d{3}[\\d(?i)x]";
        System.out.println("430424181811231877".matches(regex5));
    }
}
