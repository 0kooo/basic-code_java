package com.itheima.work2.work3;

import java.util.ArrayList;

public class work3 {
    public static void main(String[] args) {
        ArrayList<Staff> list = new ArrayList<>();

        Staff staff1 = new Staff("张三",3000);
        Staff staff2 = new Staff("李四",3500);
        Staff staff3 = new Staff("王五",4000);
        Staff staff4 = new Staff("赵六",4500);
        Staff staff5 = new Staff("田七",5000);

        list.add(staff1);
        list.add(staff2);
        list.add(staff3);
        list.add(staff4);
        list.add(staff5);

        sout(list);
        System.out.println();

        int index = getindex(list, "王五");
        Staff staff = list.get(index);
        staff.setName("王小五");

        index = getindex(list,"赵六");
        list.remove(index);

        index = getindex(list,"田七");
        staff = list.get(index);
        staff.setSalary(staff.getSalary() + 500);

        sout(list);
    }
    public static int getindex(ArrayList<Staff> list, String name){
        for (int i = 0; i < list.size(); i++) {
            Staff staff = list.get(i);
            if (staff.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void sout(ArrayList<Staff> list){
        for (int i = 0; i < list.size(); i++) {
            Staff staff = list.get(i);
            System.out.println("姓名: " + staff.getName() + ", " + "工资: " + staff.getSalary());
        }
    }


}
