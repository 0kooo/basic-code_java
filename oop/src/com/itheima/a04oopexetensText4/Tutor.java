package com.itheima.a04oopexetensText4;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("正在解决学生提出的问题");
    }
}
