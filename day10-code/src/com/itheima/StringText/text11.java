package com.itheima.StringText;

public class text11 {
    public static void main(String[] args) {
        String talk = "TMD,干得漂亮";
        String[] arr = {"TMD", "CNM", "SB"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}

