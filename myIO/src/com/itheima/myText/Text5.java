package com.itheima.myText;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Text5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myIO\\csb.txt"));
        List<String> list = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null){
            list.add(line);
        }
        br.close();
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split("\\.")[0] ) - Integer.parseInt(o2.split("\\.")[0]);
            }
        });
        //System.out.println(list);

        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\a.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
