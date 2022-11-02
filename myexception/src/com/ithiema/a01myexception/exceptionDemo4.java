package com.ithiema.a01myexception;

public class exceptionDemo4 {
    public static void main(String[] args) {
        /*
        * 自己处理
        * 二问:如果try中可能会遇到多个问题, 怎么执行?
        * 答:
        * 会写多个catch与之对应
        * 细节:
        * 如果我们要捕获多个异常, 这些异常中如果存在父子关系的话, 那么父类一定要写在下面
        * 了解性:
        * 在JDK7以后, 我们可以在catch中同时捕获多个异常, 中间用|进行隔开
        * 表示如果出现了A异常或B异常的话, 采取同一种处理方案
        * */

        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }catch (ArithmeticException e){
            System.out.println("零不能作为除数");
        }
        //如果异常相同可以写成
        //catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
        System.out.println("我执行了吗");
    }
}
