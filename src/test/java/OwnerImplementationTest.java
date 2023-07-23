import Types.Breed;
import Types.Dog;
import Types.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class OwnerImplementationTest {

    Owner testUser;
    Breed testBreed;
    Dog testPet;
    @BeforeEach
    void setUp(){
        testUser = new Owner("Test User", 22);
        testBreed = new Breed("Springer Spaniel");
        testPet = new Dog(testBreed, 3, "Max", 15.5, testUser);
    }

    //test an empty arrayList is present on creation
    @Test
    void onCreationArrayListIsEmpty(){
        assertEquals(true, testUser.getOwnedPets().isEmpty());
    }


    @Test
    void addingANewPetToArrayListIncreasesSizeByOne(){
        int previousSize = testUser.getOwnedPets().size();
        testUser.addNewPetToCurrentlyOwnedList(testPet);
        int updatedSize = testUser.getOwnedPets().size();

        assertEquals(previousSize + 1, updatedSize);
        assertNotEquals(true, testUser.getOwnedPets().isEmpty());
    }

    @Test
    void printNamesOfAllPetsInCurrentOwnerArray(){
        testUser.addNewPetToCurrentlyOwnedList(testPet);
        List<String> testStringList = testUser.printCurrentlyOwnedPets();
        for (int i = 0; i < testUser.getOwnedPets().size(); i++) {
            assertEquals(testUser.getOwnedPets().get(i).getName(), testStringList.get(i));
        }

    }
}
