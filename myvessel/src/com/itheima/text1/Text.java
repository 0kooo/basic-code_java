package com.itheima.text1;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        ArrayList<LiHuaCat> list1 = new ArrayList<>();
        ArrayList<HuskyDog> list2 = new ArrayList<>();

    }

    //要求1: 该方法能养所有品种的猫, 但是不能养狗
    public static void KeepPetCat(ArrayList<? extends Cat> list){}

    //要求2: 该方法能养所有品种的狗, 但是不能养猫
    public static void KeepPetDog(ArrayList<? extends Dog> list){}

    //要求3: 该方法能养所有的动物, 但是不能传递其他类型
    public static void KeepPet(ArrayList<? extends Animal> list){}
}
