package com.itheima.a04oopexetensText4;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("正在将自己的专业知识传输给其他人");
    }
}
