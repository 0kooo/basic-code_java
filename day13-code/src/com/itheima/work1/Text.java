package com.itheima.work1;

public class Text {
    public static void main(String[] args) {
        Student stu = new Student("zhangsan", 20, "jk2215");
        System.out.println(stu.getName() + ", " + stu.getAge() + ", " + stu.getClassGrade());
        stu.fillForm();

        System.out.println("-------------------------------");

        Teacher tec = new Teacher("lisi", 40, "教师部");
        System.out.println(tec.getName() + ", " + tec.getAge() + ", " + tec.getDepartment());
        tec.pubilshForm();
    }
}
