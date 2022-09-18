package com.itheima.work2;

public class work7 {
    /*public static void main(String[] args) {//我自己写的
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        int count = 0;
        while(true){
            int flag = str.indexOf("J");
            if(flag == -1){
                break;
            }
            str = str.substring(flag + 1);
            count++;
        }
        System.out.println(count);
    }*/
    //作者写的
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        String tar = "Java";
        // 调用方法并输出
        System.out.println(search(str, tar));
    }

    // 替换之后求长度差
    public static int search(String str, String tar) {
        String newStr = str.replace(tar, "");
        int count = (str.length() - newStr.length()) / tar.length();
        return count;

    }
}
