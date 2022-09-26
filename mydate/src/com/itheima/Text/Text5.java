package com.itheima.Text;

import java.time.LocalDate;

public class Text5 {
    public static void main(String[] args) {
        //JDK7
        /*Calendar c = Calendar.getInstance();
        c.set(2000,2,1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        */

        //JDK8
        LocalDate ld = LocalDate.of(2000, 3, 1);
        LocalDate day = ld.minusDays(1);
        int dayOfMonth = day.getDayOfMonth();
        if(dayOfMonth == 29){
            System.out.println("是闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
