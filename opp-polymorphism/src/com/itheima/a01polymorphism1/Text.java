package com.itheima.a01polymorphism1;

public class Text {
    public static void main(String[] args) {
        Student s = new Student("zhangsan",18);
        Teacher t = new Teacher("阿伟老师",30);
        Manager m = new Manager("管理员",40);

        register(s);
        register(t);
        register(m);
    }

    public static void register(Person p){
        p.show();
    }
}
