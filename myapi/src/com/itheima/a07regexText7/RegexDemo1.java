package com.itheima.a07regexText7;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "123456789";
        //正常方法
        /*boolean b = checkQQ(qq);
        if(b){
            System.out.println("qq号正确");
        }else{
            System.out.println("qq号格式错误");
        }*/
        //正则表达式
        System.out.println(qq.matches("[1~9]\\d{5,19}"));

    }

    public static boolean checkQQ(String qq){
        char c = qq.charAt(0);
        if(c == '0'){
            return false;
        }
        if(qq.length() < 6 || qq.length() > 20){
            return false;
        }
        char[] qqArr = qq.toCharArray();
        for (int i = 0; i < qqArr.length; i++) {
            char ch = qqArr[i];
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }
}
