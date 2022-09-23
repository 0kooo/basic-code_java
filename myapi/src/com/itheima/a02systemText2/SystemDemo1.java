package com.itheima.a02systemText2;

public class SystemDemo1 {
    public static void main(String[] args) {
        //方法的参数: 状态码
        //0: 表示当前虚拟机是正常停止
        //非0: 表示当前虚拟机非正常停止
//        System.exit(0);
//        System.out.println("看看我执行了吗!");

        long l = System.currentTimeMillis();
        System.out.println(l);

        //拷贝数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        //将arr1中的数据拷贝到arr2中
        //参数一:数据源,要拷贝的数据从那个数组来
        //参数二:从数据源数组中第几个开始拷贝
        //参数三:目的地,我要把数据拷贝到那个数组中
        //参数四:目的地数组的索引
        //参数五:拷贝的个数

        //课堂练习1: 0 0 0 0 1 2 3 0 0 0
        //System.arraycopy(arr1, 0, arr2, 4, 3);

        //课堂练习2: 0 0 7 8 9 0 0 0 0 0
        System.arraycopy(arr1,6,arr2,2,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] +", ");
        }
    }
}
