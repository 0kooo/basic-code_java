package com.itheima.doudizu3;

import java.util.*;

public class PokerGame {
    static ArrayList<String> list = new ArrayList<>();
    static Map<String, Integer> map = new HashMap<>();

    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "K", "A", "Q", "J", "2"};
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" 小王");
        list.add(" 大王");
    }

    static {
        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 14);
        map.put("2", 15);
        map.put("小王", 50);
        map.put("大王", 100);
    }


    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //System.out.println(list);

        //发牌
        ArrayList<String> role = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                role.add(list.get(i));
                continue;
            }
            if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }

        //排序
        orderPoker(role);
        orderPoker(player1);
        orderPoker(player2);
        orderPoker(player3);

        //看牌
        lookPoker("底牌", role);
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);

    }

    public void orderPoker(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1: 表示当前要插入到有序序列中的牌
                //o2: 表示已经在有序序列中存在的牌

                //负数: o1小 插入到前面
                //正数: o2小 插入到后面
                //0: o1的数字跟o2的数字是一样的, 需要按照花色再次排序

                //1.计算o1的花色和价值
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                //2.计算o2的花色和价值
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                //3.比较o1和o2的价值
                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    //计算牌的价值
    //参数: 牌
    //返回值: 价值
    public int getValue(String poker) {
        //获取牌上价值
        String number = poker.substring(1);
        //拿着数字到map集合中判断是否存在
        if (map.containsKey(number)) {
            //存在,获取价值
            return map.get(number);
        } else {
            //不存在,类型转换
            return Integer.parseInt(number);
        }
    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
