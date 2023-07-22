package org.example;

import Types.Breed;
import Types.Dog;
import Types.Owner;

public class Main {
    public static void main(String[] args) {
        Breed breed = new Breed("Test");
        Owner owner = new Owner("Paul", 20);

        System.out.println(owner.getOwnedPets());

        Dog test = new Dog(breed, 4, "dog", 22.2, null);
        Dog test2 = new Dog(breed, 4, "dog", 22.2, null);

        System.out.println(owner.getOwnedPets());

        owner.addNewPetToCurrentlyOwnedList(test);

        System.out.println(owner.getOwnedPets());

        owner.removePetFromCurrentList(test);

        System.out.println(owner.getOwnedPets());

        owner.removePetFromCurrentList(test2);
    }
}