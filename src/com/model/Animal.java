package com.model;

public abstract class Animal{
    private String name;
    private String color;
    private int age;
    private double weight;
    private int animalID;

    public Animal(String name, String color, int age, double weight, int animalID) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.animalID = animalID;
    }

    public Animal() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public abstract void eat();
    public abstract void makeSound();
    public abstract void sleep();
}