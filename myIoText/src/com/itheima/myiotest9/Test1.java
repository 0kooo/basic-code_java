package com.itheima.myiotest9;

import java.util.Properties;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        //Properties作为Map集合的操作
        Properties prop = new Properties();

        prop.put("aaa", "111");
        prop.put("bbb", "222");
        prop.put("ccc", "333");

        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object value = prop.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
