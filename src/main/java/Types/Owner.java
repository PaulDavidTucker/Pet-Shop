package Types;

import Interfaces.OwnerBehaviour;

import java.util.*;


/*
    Owner class
 */

public class Owner extends User implements OwnerBehaviour {

    private List<Animal> OwnedPets;
    public Owner (String UserName, int Age){
        super(UserName, Age, "Owner");

        //Create an empty list of pets for owner on creation
        this.OwnedPets = new ArrayList<>();
    }

    public List<Animal> getOwnedPets() {
        return OwnedPets;
    }

    /*
        Add a pet to the list for this object.
     */
    @Override
    public void addNewPetToCurrentlyOwnedList(Animal petToAdd){
        this.OwnedPets.add(petToAdd);
    }

    @Override
    public void removePetFromCurrentList(Animal petToRemove){
        boolean containedListThisPet = this.OwnedPets.remove(petToRemove);
    }

    public List<String> printCurrentlyOwnedPets(){
        ArrayList<String> listOfNames = new ArrayList<>();
        for (Animal Pet:this.getOwnedPets()) {
            System.out.println(Pet.getName());
            listOfNames.add(Pet.getName());
        }
        return listOfNames;
    }

}
