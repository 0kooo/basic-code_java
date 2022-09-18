package com.itheima.work4;

public class Employee {
    private String name;
    private String id;
    private int selery;

    public Employee() {
    }

    public Employee(String name, String id, int selery) {
        this.name = name;
        this.id = id;
        this.selery = selery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSelery() {
        return selery;
    }

    public void setSelery(int selery) {
        this.selery = selery;
    }

    public void work(){
        System.out.println("工作");
    }
}
