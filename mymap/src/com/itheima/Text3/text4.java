package com.itheima.Text3;

import java.util.*;

public class text4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list1,"南京市","扬州市","苏州市","无锡市","常州市");
        Collections.addAll(list2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        Collections.addAll(list3,"石家庄市","唐山市","邢台市","保定市","张家口市");
        hm.put("江苏省",list1);
        hm.put("湖北省",list2);
        hm.put("河北省",list3);
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            //创建一个集合将所有城市都按格式输出,但先要将城市添加到集合中
            StringJoiner sj = new StringJoiner(", ","","");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }
    }
}
