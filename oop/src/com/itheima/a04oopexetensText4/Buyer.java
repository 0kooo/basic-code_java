package com.itheima.a04oopexetensText4;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("正在采购必须物资");
    }
}
