package com.model;

import com.interfaces.WalkingAnimal;

public class Lion extends Animal implements WalkingAnimal {

    public Lion(String name, String color, int age, double weight, int animalID) {
        super(name, color, age, weight, animalID);
    }

    public Lion() {
        super();
    }

    @Override
    public void walk() {
        System.out.printf("%s is walking.\n", getName());
    }

    @Override
    public void eat() {
        System.out.printf("%s is eating meat.\n", getName());
    }

    @Override
    public void makeSound() {
        System.out.printf("%s lets out a powerful roar.\n", getName());
    }

    @Override
    public void sleep() {
        System.out.printf("%s is sleeping.\n", getName());
    }
}