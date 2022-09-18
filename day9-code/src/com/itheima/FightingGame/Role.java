package com.itheima.FightingGame;

import java.util.Random;

public class Role {
    //属性
    private String name;
    private int blood;

    //空参
    public Role() {
    }

    //有参
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    //get和set
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public void attact(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName() + "举起了拳头,打了" + role.getName() + "一下" + "造成了" + hurt + "伤害," + role.getName() + "还剩" + remainBlood + "点血量");
    }
}
