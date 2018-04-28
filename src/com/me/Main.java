package com.me;

// The @Override means that the method is overriding the parent class (in this case createSolver )

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Rover", "bark");
        dog.name();
        dog.soundAnimalMakes();
        System.out.println(dog.name());
        System.out.println(dog.soundAnimalMakes());

        System.out.println("========================");

        Horse horse = new Horse("Mr. Ed", "Hey Wilbur");
        horse.name();
        horse.soundAnimalMakes();
        System.out.println(horse.name());
        System.out.println(horse.soundAnimalMakes());

    }

}

/*
results;
Rover
bark
========================
Mr. Ed
Hey Wilbur
 */
