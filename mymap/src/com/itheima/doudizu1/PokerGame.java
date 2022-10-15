package com.itheima.doudizu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //准备牌
    static ArrayList<String> list = new ArrayList<>();
    static {
        String[] color = {"♦","♣","♥","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","K","A","Q","J","2"};
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");
    }

    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //System.out.println(list);

        //发牌
        ArrayList<String> role = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

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

        //看牌
        lookPoker("底牌",role);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);
    }

    public void lookPoker(String name, ArrayList<String> list){
        System.out.print(name + ": ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
