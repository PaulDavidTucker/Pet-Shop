package Interfaces;

import Types.Animal;

public interface OwnerBehaviour {
    public void addNewPetToCurrentlyOwnedList(Animal petToBeAdded);

    public void removePetFromCurrentList(Animal petToRemove);
}
