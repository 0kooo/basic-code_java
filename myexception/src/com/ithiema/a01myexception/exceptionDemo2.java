package com.ithiema.a01myexception;

public class exceptionDemo2 {
    public static void main(String[] args) {
        /*
        *   自己处理异常
        *   try{
        *       可能出现的异常
        *   }catch(异常类名 异常变量名){
        *       异常的处理代码
        *   }
        *   好处: 可以让程序继续往下执行, 不会停止
        * */

        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("我执行了吗");
    }
}
