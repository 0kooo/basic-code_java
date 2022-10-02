package com.itheima.text1;

public class text2 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        boolean result = check(strA, strB);
        System.out.println(result);
    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
    //case1
    //用subString进行截取,把左边的字符取出来拼接到右侧去
    public static String rotate(String strA) {
        char c = strA.charAt(0);
        String end = strA.substring(1);
        return end + c;
    }


    //case2
    //可以把字符串先变成一个字符数组,然后调整字符数组里面数据,最后再把字符数组变成字符串
    /*public static String rotate(String str){
        char[] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        String result = new String(arr);
        return result;
    }*/
}
