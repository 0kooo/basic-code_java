package com.itheima.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CodeUtil {

    public static String getCode(){
        Random r = new Random();
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) (i + 'A'));
        }
        for(int i = 0;  i < 26; i++){
            list.add((char) (i + 'a'));
        }
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            result.add(list.get(index));
        }
        int number = r.nextInt(10);
        result.add((char)(number + '0'));
        Collections.shuffle(result);
        String s = "";
        for (Character character : result) {
            s = s + character;
        }
        return s;
    }
}