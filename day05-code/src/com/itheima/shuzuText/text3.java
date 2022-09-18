package com.itheima.shuzuText;

public class text3 {
    public static void main(String[] args) {
        //1.定义一个数组,来存1,2,3,4,5,6,7,8,9,10
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //3.对每一个元素进行判断
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            }else{
                arr[i] = arr[i] * 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
