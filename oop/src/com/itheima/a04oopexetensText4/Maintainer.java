package com.itheima.a04oopexetensText4;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("正在维持公司的基础设备的工作");
    }
}
