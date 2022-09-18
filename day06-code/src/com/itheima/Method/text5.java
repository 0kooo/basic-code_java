package com.itheima.Method;

public class text5 {
    public static void main(String[] args) {
        int area1 = gteArea(10,20);
        int area2 = gteArea(20,30);
        if(area1 > area2){
            System.out.println("第一个长方体面积更大");
        }else{
            System.out.println("第二个长方体面积更大");
        }
    }
    public static int  gteArea(int c, int k){
        int area = c * k;
        return area;
    }
}
