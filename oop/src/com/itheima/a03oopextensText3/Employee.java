package com.itheima.a03oopextensText3;

public class Employee {
    private String id;
    private String name;
    private int selery;

    public Employee() {
    }

    public Employee(String id, String name, int selery) {
        this.id = id;
        this.name = name;
        this.selery = selery;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSelery() {
        return selery;
    }

    public void setSelery(int selery) {
        this.selery = selery;
    }

    public void eat() {
        System.out.println("吃饭(吃米饭)");
    }

    public void work() {
        System.out.println("工作");
    }
}
