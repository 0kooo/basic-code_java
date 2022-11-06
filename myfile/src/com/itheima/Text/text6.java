package com.itheima.Text;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class text6 {
    public static void main(String[] args) {
        File file = new File("E:\\aaa");
        HashMap<String, Integer> count = getCount(file);
        System.out.println(count);
    }

    public static HashMap<String, Integer> getCount(File stc){
        HashMap<String, Integer> hm = new HashMap<>();

        File[] files = stc.listFiles();
        for (File file : files) {
            if(file.isFile()){
                String name = file.getName();
                String[] arr = name.split("\\.");
                String endName = arr[arr.length - 1];
                if(arr.length >=2 ){
                    if(hm.containsKey(endName)){
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName, count);
                    }else{
                        hm.put(endName,1);
                    }
                }
            }else{
                HashMap<String, Integer> sonCount = getCount(file);
                Set<Map.Entry<String, Integer>> entries = sonCount.entrySet();

                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if(hm.containsKey(key)){
                        int count = hm.get(key);
                        hm.put(key, count + value);
                    }else{
                        hm.put(key, value);
                    }
                }
            }
        }
        return hm;
    }
}
