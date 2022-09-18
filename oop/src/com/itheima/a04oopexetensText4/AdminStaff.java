package com.itheima.a04oopexetensText4;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("正在为公司出一个力");
    }
}
