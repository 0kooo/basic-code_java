package com.itheima.work4;

public class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, String id, int selery) {
        super(name, id, selery);
    }

    @Override
    public void work(){
        System.out.println("写代码");
    }
}
