package com.itheima.text5;

import java.util.Scanner;

public class StudentTxet {
    public static void main(String[] args) {
        //目标1
        Student[] arr = new Student[3];
        Student stu1 = new Student(001, "张三", 18);
        Student stu2 = new Student(002, "李四", 19);
        Student stu3 = new Student(003, "王五", 20);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //要求1:再次添加一个学生对象,并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student(004, "赵六", 21);
        boolean flag = contains(arr, stu4.getId());
        //判断是否存在此id
        if (flag) {
            //已存在
            System.out.println("当前id以重复,请重新输入id再添加");
        } else {
            //不存在
            int count = getCount(arr);
            if (count == arr.length) {
                //1.数组已经存满
                //创建新数组
                //把老数组的元素和需要新添加的元素一起放进去
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                //要求2:添加完毕之后,遍历所以学生信息
                printArr(newArr);
                //要求3:通过id删除学生信息
                //如果存在,则删除,如果不存在,则提示删除失败
                deleteId(newArr);

                //要求4:删除完毕之后,遍历所以学生信息
                printArr(newArr);

                //要求5:查询数组id为"heima002"的学生,如果存在,则将他的年龄+1岁
                int index = inquireId(newArr);
                if(index >= 0){
                    Student stu = newArr[index];
                    System.out.println(stu.getAge());
                }else{
                    System.out.println("当前id不存在");
                }
            } else {
                //2.数组没有存满
                arr[count] = stu4;
                //要求2:添加完毕之后,遍历所以学生信息
                printArr(arr);

                //要求3:通过id删除学生信息
                //如果存在,则删除,如果不存在,则提示删除失败
                deleteId(arr);

                //要求4:删除完毕之后,遍历所以学生信息
                printArr(arr);

                //要求5:查询数组id为"heima002"的学生,如果存在,则将他的年龄+1岁
                int index = inquireId(arr);
                if(index >= 0){
                    Student stu = arr[index];
                    System.out.println(stu.getAge());
                }else{
                    System.out.println("当前id不存在");
                }
            }
        }
    }

    //判断数组中是否存在此id
    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu.getId() == id){
                return true;
            }
        }
        return false;
    }
    //获得数组中的元素个数
    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                count++;
            }
        }
        return count;
    }
    //创建新的数组,并将老数组的元素,加入到新数组
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //打印数组中的元素
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() +","+ stu.getAge() +","+ stu.getName());
            }
        }
    }

    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                if (stu.getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void deleteId(Student[] arr){
        //要求3:通过id删除学生信息
        //如果存在,则删除,如果不存在,则提示删除失败
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想删除的学生id");
        int id = sc.nextInt();
        int index = getIndex(arr,id);
        if(index >= 0){
            arr[index] = null;
        }else{
            System.out.println("删除失败");
        }
    }

    public static int inquireId(Student[] arr){
        //要求5:查询数组id为"heima002"的学生,如果存在,则将他的年龄+1岁
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想查询学生的id");
        int id = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                if (stu.getId() == id) {
                    stu.setAge(stu.getAge() + 1);
                    return i;
                }
            }
        }
        return -1;
    }
}
