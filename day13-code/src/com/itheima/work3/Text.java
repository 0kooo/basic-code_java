package com.itheima.work3;

public class Text {
    public static void main(String[] args) {
        Person.nationality = "中国";
        Student.school = "黑马学院";

        Student stu1 = new Student("zhangsan", "男", 20, "001");
        System.out.println(stu1.getName() + ", " + stu1.getGender() + ", " + stu1.getAge() + ", " +
                stu1.getStuNumber() + ", " + stu1.nationality + ", " + stu1.school);
        stu1.work();

        Worker work = new Worker("lisi", "男", 40, "建筑部", 10);
        System.out.println(work.getName() + ", " + work.getGender() + ", " + work.getAge() + ", " +
                work.getUnit() + ", " + work.getWorkAge() + ", " + work.nationality);
        work.work();

        StudentLeader stu2 = new StudentLeader("wangwu", "女", 21, "002", "学风督察");
        System.out.println(stu2.getName() + ", " + stu2.getGender() + ", " + stu2.getAge() + ", " +
                stu2.getStuNumber() + ", " + stu2.nationality + ", " + stu2.school + ", " + stu2.getJob());
        stu2.work();
        stu2.meeting();
    }
}
