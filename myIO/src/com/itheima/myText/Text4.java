package com.itheima.myText;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Text4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myIO\\a.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while((b = fr.read()) != -1){
            sb.append((char)b);
        }
        fr.close();

        Integer[] arr = Arrays.stream(sb.toString().split("-")).map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        FileWriter fw = new FileWriter("myIO\\a.txt");
        String s = Arrays.toString(arr).replace(", ", "-");
        String result = s.substring(1, s.length() - 1);
        fw.write(result);
        fw.close();
    }
}
