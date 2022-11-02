package com.ithiema.a01myexception;

public class exceptionDemo3 {
    public static void main(String[] args) {
        /*
        * 自己处理(捕获异常)
        * 一问:
        * 如果try中没有遇到问题, 怎么执行
        * 答:
        * 会把try里面所有的代码全部执行完毕, 不会执行catch里面的代码
        * 注意:
        * 只有当出现了异常才执行catch里面的代码
        *
        * */
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("我执行了吗");
    }
}
