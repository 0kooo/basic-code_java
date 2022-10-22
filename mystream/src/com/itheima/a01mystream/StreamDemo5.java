package com.itheima.a01mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //一堆零散数据

        Stream.of(1,2,3,4).forEach(s -> System.out.println(s));
    }
}
