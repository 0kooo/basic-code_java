package com.itheima.a02polymorphism2;

public class Text {
    public static void main(String[] args) {
        Dog dog = new Dog(2,"黑");
        Cat cat = new Cat(3,"白");

        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);

        p1.keepPet(dog,"骨头");
        p2.keepPet(cat,"小鱼干");

    }
}
