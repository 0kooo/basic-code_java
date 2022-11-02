package com.ithiema.a01myexception;

public class exceptionDemo5 {
    public static void main(String[] args) {
        /*
        * public String getMessage()        返回此throwable的详细消息字符串
        * public String toString()          返回此刻抛出的简短描述
        * public void printStachTrace()     把异常的错误信息输出在控制台
        *                                   细节: 仅仅是打印信息, 不会停止程序运行
        * */
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            /*String message = e.getMessage();
            System.out.println(message);*/
            /*String s = e.toString();
            System.out.println(s);*/
            e.printStackTrace();
        }

        System.out.println("看看我执行了吗");
    }
}
