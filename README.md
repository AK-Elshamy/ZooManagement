# Zoo Management System

A simple Java project that demonstrates **Object-Oriented Programming (OOP)** and **SOLID principles** through managing animals inside a small zoo.

The project is designed as an educational MVP to show clean structure, separation of responsibilities, and the use of interfaces for behavior.

---

## Features

* Add animals to the zoo
* Retrieve animals by ID
* List all animals
* Remove animals
* Trigger animal activities (walk, fly, swim)
* Feed animals
* Demonstrates OOP and SOLID principles in a practical way

---

## OOP Concepts Used

**Abstraction**

* `Animal` is an abstract base class defining common fields and abstract behaviors (`eat()`, `sleep()`, `makeSound()`).

**Inheritance**

* Classes such as `Lion`, `Eagle`, and `Fish` extend `Animal`.

**Polymorphism**

* Each animal implements its behavior differently when performing activities or making sounds.

**Encapsulation**

* Private fields with getters/setters inside `Animal`.

---

## SOLID Principles Used

**Single Responsibility Principle (SRP)**

* `AnimalService` manages animals only.
* Behavior interfaces manage only one action each (fly, walk, swim).

**Open/Closed Principle (OCP)**

* You can add new animals without modifying existing logic.
* Each new animal simply extends `Animal` and implements the correct interfaces.

**Liskov Substitution Principle (LSP)**

* Each animal implements only behaviors it can actually perform.
  Example: Eagle implements `FlyingAnimal`, Lion does not.

**Interface Segregation Principle (ISP)**

* Behavior is split into multiple small interfaces:
  `FlyingAnimal`, `WalkingAnimal`, `SwimmingAnimal`.

**Dependency Inversion Principle (DIP)**

* `AnimalService` depends on abstractions (`Animal`, behavior interfaces), not concrete implementations.

---

## Project Structure

```
src/
├── com/
│   ├── model/
│   │   ├── Animal.java
│   │   ├── Lion.java
│   │   ├── Eagle.java
│   │   └── Fish.java
│   │
│   ├── interfaces/
│   │   ├── FlyingAnimal.java
│   │   ├── WalkingAnimal.java
│   │   └── SwimmingAnimal.java
│   │
│   ├── service/
│   │   └── AnimalService.java
│   │
│   └── Main.java
```

---

## How to Run

Compile the project:

```
javac -d out src/com/**/*.java
```

Run:

```
java -cp out com.Main
```

---

## Example Main Output (Short)

```
--- Zoo Service Initialized ---
Total animals at start: 0
-------------------------------

--- Adding Animals ---
Animal with ID 101 already exists.
Current animal count: 3

--- Testing Activities (Polymorphism) ---
Simba is walking.
Aigle is flying high.
Nemo is swimming slowly in the tank.


--- Testing Feeding ---
Simba is eating meat.
Nemo is eating fish flakes.
Error: Animal with ID 999 not found for feeding.


--- Testing Removal ---
Animal with ID 202 removed successfully.
Animal with ID 999 not found.
Animals after removal: 2

--- Remaining Animals ---
ID: 101, Name: Simba, Age: 5
Simba lets out a powerful roar.
ID: 303, Name: Nemo, Age: 1
Nemo makes no audible sound.
```

---

# ZooManagement
