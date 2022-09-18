package com.itheima.work4;

public class textDogAndCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.setColor("花色的");
        cat.setBreed("波斯猫");
        dog.setColor("黑色的");
        dog.setBreed("藏獒");

        cat.eat(cat.getColor(), cat.getBreed());
        cat.catchMouse(cat.getColor(), cat.getBreed());
        dog.eat(dog.getColor(), dog.getBreed());
        dog.lookHome(dog.getColor(), dog.getBreed());
    }
}
