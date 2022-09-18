package com.itheima.a03oopextensText3;

public class Cook extends Employee {
    public Cook() {
    }

    public Cook(String id, String name, int selery) {
        super(id, name, selery);
    }

    @Override
    public void work() {
        System.out.println("工作(炒菜)");
    }
}
