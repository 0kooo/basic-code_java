package com.itheima.a04oopexetensText4;

public class Lecturer extends Teacher {
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("正在教书");
    }
}
