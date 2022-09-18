package com.itheima.work4;

public class Manager extends Employee{
    private int bonus;

    public Manager() {
    }

    public Manager(String name, String id, int selery, int bonus) {
        super(name, id, selery);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("检查程序员交上来的代码");
    }
}
