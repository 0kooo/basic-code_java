package com.itheima.myText;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Text6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myIO\\csb.txt"));
        TreeMap<Integer, String> tm = new TreeMap<>();
        String line;
        while((line = br.readLine()) != null){
            String[] newLine = line.split("\\.");
            tm.put(Integer.parseInt(newLine[0]), newLine[1]);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\a.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
