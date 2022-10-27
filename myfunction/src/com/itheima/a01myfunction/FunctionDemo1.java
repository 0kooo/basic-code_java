package com.itheima.a01myfunction;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {2,4,5,1,3,6};
        //匿名内部类
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/

        //lambda表达式
        /*Arrays.sort(arr,(Integer o1,Integer o2) -> {
            return o2 - o1;
        });*/

        //lambda表达式简化格式
        //Arrays.sort(arr,(o1,o2) -> o2 - o1);

        //方法引用
        //1.引用处需要是函数式接口
        //2.被引用的方法需要已经存在
        //3.被引用方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        //4.被引用方法的功能需要满足当前的要求

        //表示引用FunctionDemo类里面的subtraction方法
        //把这个方法当做抽象方法的方法体
        Arrays.sort(arr,FunctionDemo1::subtraction);

        System.out.println(Arrays.toString(arr));
    }

    //可以是Java已经写好的, 也可以是一些第三方的工具类
    public static int subtraction(int num1, int num2){
        return num2 - num1;
    }
}
