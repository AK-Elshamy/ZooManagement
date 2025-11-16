package com.model;

import com.interfaces.SwimmingAnimal;

public class Fish extends Animal implements SwimmingAnimal {
    public Fish(String name, String color, int age, double weight, int animalID) {
        super(name, color, age, weight, animalID);
    }

    public Fish() {
        super();
    }

    @Override
    public void swim() {
        System.out.printf("%s is swimming slowly in the tank.\n", getName());
    }

    @Override
    public void eat() {
        System.out.printf("%s is eating fish flakes.\n", getName());
    }

    @Override
    public void makeSound() {
        System.out.printf("%s makes no audible sound.\n", getName());
    }

    @Override
    public void sleep() {
        System.out.printf("%s is resting motionlessly.\n", getName());
    }
}