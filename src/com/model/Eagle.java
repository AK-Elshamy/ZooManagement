package com.model;

import com.interfaces.FlyingAnimal;

public class Eagle extends Animal implements FlyingAnimal {

    public Eagle(String name, String color, int age, double weight, int animalID) {
        super(name, color, age, weight, animalID);
    }

    public Eagle() {
        super();
    }

    @Override
    public void fly() {
        System.out.printf("%s is flying high.\n", getName());
    }

    @Override
    public void eat() {
        System.out.printf("%s is eating prey.\n", getName());
    }

    @Override
    public void makeSound() {
        System.out.printf("%s makes a sharp whistle sound.\n", getName());
    }

    @Override
    public void sleep() {
        System.out.printf("%s is sleeping.\n", getName());
    }
}