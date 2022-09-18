package com.itheima.a02oopextensText2;

public class Text {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.lookHome();
        h.drinking();

        System.out.println("------------------------------------------");
        SharPei sp = new SharPei();
        sp.eat();
        sp.lookHome();
        sp.drinking();

        System.out.println("------------------------------------------");
        ChinesDog cd = new ChinesDog();
        cd.eat();
        cd.lookHome();
        cd.drinking();
    }
}
