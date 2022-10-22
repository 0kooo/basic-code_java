package com.itheima.a01mystream;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {
        // 数组 public static <T> Stream<T> stream(T[] array)
        //1.创建数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        String[] arr2 = {"a", "b","c"};

        //2.获取stream流
        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        System.out.println("-------------------------------------------------");

        Arrays.stream(arr2).forEach(s -> System.out.println(s));
    }
}
