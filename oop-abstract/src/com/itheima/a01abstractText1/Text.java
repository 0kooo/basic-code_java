package com.itheima.a01abstractText1;

public class Text {
    public static void main(String[] args) {
        Dog dog = new Dog("zangao",2);
        sheep cat = new sheep("tuantuan",2);
        Frog frog = new Frog("tiaotiao",1);

        System.out.println(dog.getName()+ ", " + dog.getAge());
        dog.eat();
        dog.drinking();

        cat.eat();
        cat.drinking();

        frog.eat();
        frog.drinking();
    }
}
