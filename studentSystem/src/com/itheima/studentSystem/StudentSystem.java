package com.itheima.studentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();

        loop:
        while (true) {
            System.out.println("------------------------欢迎来到黑马学生管理系统------------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择: ");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选择");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while (true) {
            System.out.println("请输入学生id");
            String id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("id已存在,添加失败");
            } else {
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生住址");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);

        System.out.println("学生信息添加成功");

    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除学生的id");
        String id = sc.next();
        boolean flag = contains(list, id);
        int index = getIndex(list, id);
        if(flag){
            list.remove(index);
            System.out.println("id为" + id + "的学生,已经删除成功");
        }else{
            System.out.println("id不存在,删除失败");
            return;
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的学生id");
        String id = sc.next();
        boolean flag = contains(list, id);
        int index = getIndex(list, id);
        if (flag) {
            Student stu = list.get(index);

            System.out.println("请输入你要修改的名字");
            String newName = sc.next();
            stu.setName(newName);

            System.out.println("请输入你要修改的年龄");
            int newAge = sc.nextInt();
            stu.setAge(newAge);

            System.out.println("请输入你要修改的地址");
            String newAddress = sc.next();
            stu.setAddress(newAddress);

            System.out.println("学生信息修改成功");
        } else {
            System.out.println("id不存在,修改失败");
            return;
        }
    }

    //查询功能
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息,请添加后再查询");
        }

        System.out.println("id\t\t\t姓名\t年龄\t家庭住址\t");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    //检查id是否重复,并返回index
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    //只检查是否有,并返回true or false
    public static boolean contains(ArrayList<Student> list, String id) {
        if (getIndex(list, id) != -1) {
            return true;
        }
        return false;
    }

}
