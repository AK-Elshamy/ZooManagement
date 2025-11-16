package com;

import com.model.*;
import com.service.AnimalService;

public class Main {
    public static void main(String[] args) {

        AnimalService zooManager = new AnimalService();
        System.out.println("--- Zoo Service Initialized ---");
        System.out.println("Total animals at start: " + zooManager.countAnimals());
        System.out.println("-------------------------------\n");

        Lion simba = new Lion("Simba", "Golden", 5, 190.5, 101);
        Eagle aigle = new Eagle("Aigle", "Brown", 3, 5.2, 202);
        Fish nemo = new Fish("Nemo", "Orange", 1, 0.1, 303);

        System.out.println("--- Adding Animals ---");
        zooManager.addAnimal(simba);
        zooManager.addAnimal(aigle);
        zooManager.addAnimal(nemo);
        zooManager.addAnimal(new Lion("Mufasa", "Dark Brown", 10, 220.0, 101));
        System.out.println("Current animal count: " + zooManager.countAnimals() + "\n");

        System.out.println("--- Testing Activities (Polymorphism) ---");
        zooManager.performActivity(101);
        zooManager.performActivity(202);
        zooManager.performActivity(303);
        System.out.println("\n");

        System.out.println("--- Testing Feeding ---");
        zooManager.feedAnimal(101);
        zooManager.feedAnimal(303);
        zooManager.feedAnimal(999);
        System.out.println("\n");

        System.out.println("--- Testing Removal ---");
        zooManager.removeAnimalByID(202);
        zooManager.removeAnimalByID(999);
        System.out.println("Animals after removal: " + zooManager.countAnimals());

        System.out.println("\n--- Remaining Animals ---");
        for (Animal animal : zooManager.getAllAnimals()) {
            System.out.printf("ID: %d, Name: %s, Age: %d\n",
                    animal.getAnimalID(), animal.getName(), animal.getAge());
            animal.makeSound();
        }
    }
}