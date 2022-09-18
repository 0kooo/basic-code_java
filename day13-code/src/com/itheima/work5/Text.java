package com.itheima.work5;

public class Text {
    public static void main(String[] args) {
        Dog dog = new Dog(2,"黑色");
        dog.eat("骨头");

        Cat cat = new Cat(2,"白色");
        cat.eat("小鱼干");

        Person pers = new Person();
        pers.keepPet(dog,"骨头");
        pers.keepPet(cat,"小鱼干");
    }
}
