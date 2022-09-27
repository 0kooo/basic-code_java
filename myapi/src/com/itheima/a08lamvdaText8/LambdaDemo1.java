package com.itheima.a08lamvdaText8;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {
        String[] arr = {"a", "aaaa", "aaa", "aa"};

        Arrays.sort(arr, (String o1, String o2) -> {
                return o1.length() - o2.length();
            }
        );

        System.out.println(Arrays.toString(arr));
    }
}
