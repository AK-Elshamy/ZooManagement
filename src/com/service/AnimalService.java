package com.service;

import com.interfaces.FlyingAnimal;
import com.interfaces.SwimmingAnimal;
import com.interfaces.WalkingAnimal;
import com.model.Animal;
import java.util.ArrayList;
import java.util.List;

public class AnimalService {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        if (getAnimalByID(animal.getAnimalID()) != null) {
            System.out.println("Animal with ID " + animal.getAnimalID() + " already exists.");
            return;
        }
        animals.add(animal);
    }


    public Animal getAnimalByID(int id){
        for (Animal animal : animals)
        {
            if(animal.getAnimalID() == id){
                return animal;
            }
        }
        return null;
    }

    public void removeAnimalByID(int id){
        int index = -1;
        for(int i = 0; i < animals.size(); ++i){
            if(id == animals.get(i).getAnimalID()){
                index = i;
                break;
            }
        }

        if (index != -1) {
            animals.remove(index);
            System.out.printf("Animal with ID %d removed successfully.\n", id);
        } else {
            System.out.printf("Animal with ID %d not found.\n", id);
        }
    }

    public List<Animal> getAllAnimals(){
        return new ArrayList<>(animals);
    }

    public int countAnimals(){
        return animals.size();
    }

    public void performActivity(int id){
        Animal animal = getAnimalByID(id);
        if (animal == null) {
            System.out.printf("Error: Animal with ID %d not found to perform activity.\n", id);
            return;
        }

        if(animal instanceof FlyingAnimal){
            ((FlyingAnimal) animal).fly();
        } else if(animal instanceof WalkingAnimal){
            ((WalkingAnimal) animal).walk();
        } else if (animal instanceof SwimmingAnimal) {
            ((SwimmingAnimal) animal).swim();
        } else {
            System.out.printf("%s has no specialized movement activity defined.\n", animal.getName());
        }
    }



    public void feedAnimal(int id) {
        Animal animalToFeed = getAnimalByID(id);

        if (animalToFeed != null) {
            animalToFeed.eat();
        } else {
            System.out.printf("Error: Animal with ID %d not found for feeding.\n", id);
        }
    }



}