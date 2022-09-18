package com.itheima.a03oopextensText3;

public class Manager extends Employee {
    private int bonus;

    public Manager() {
    }

    public Manager(String id, String name, int selery, int bonus) {
        super(id, name, selery);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("工作(管理其他人)");
    }
}
