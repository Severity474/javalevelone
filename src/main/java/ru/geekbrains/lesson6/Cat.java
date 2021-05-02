package ru.geekbrains.lesson6;

public class Cat extends Animal{

    Cat(String name) {
        super("Cat", name, 2, 200, 2);
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_NO;
    }
}