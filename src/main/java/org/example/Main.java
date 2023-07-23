package org.example;

import Types.Breed;
import Types.Dog;
import Types.Owner;

public class Main {
    public static void main(String[] args) {
        Breed breed = new Breed("Test");
        Owner owner = new Owner("Paul", 20);

        Dog test = new Dog(breed, 4, "dog", 22.2, null);
        Dog test2 = new Dog(breed, 4, "other dog", 22.2, null);

        owner.addNewPetToCurrentlyOwnedList(test);
        owner.addNewPetToCurrentlyOwnedList(test2);
        owner.printCurrentlyOwnedPets();
    }
}