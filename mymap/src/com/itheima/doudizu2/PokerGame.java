package com.itheima.doudizu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //准备牌
    static HashMap<Integer,String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static{
        String[] color = {"♦","♣","♥","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","K","A","Q","J","2"};
        int serialNumber = 1;
        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber, n + c);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber,"大王");
        list.add(serialNumber);
    }
    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //System.out.println(list);

        //发牌
        TreeSet<Integer> role = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if(i <= 2){
                role.add(list.get(i));
                continue;
            }
            if(i % 3 == 0){
                player1.add(list.get(i));
            }else if(i % 3 == 1){
                player2.add(list.get(i));
            }else{
                player3.add(list.get(i));
            }
        }
        /*System.out.println(role);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);*/

        //看牌
        lookPoker("底牌",role);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);

    }

    public void lookPoker(String name, TreeSet<Integer> ts){
        System.out.println(name + ": ");
        for (Integer t : ts) {
            String serialNumber = hm.get(t);
            System.out.print(serialNumber + " ");
        }
        System.out.println();
    }
}
