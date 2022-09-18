package com.itheima.a03staticText3;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil(){}

    public static int getMaxStudentAge(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(max < stu.getAge()){
                max = stu.getAge();
            }
        }
        return max;
    }
}
