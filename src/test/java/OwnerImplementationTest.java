import Types.Animal;
import Types.Breed;
import Types.Dog;
import Types.Owner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void addingANewPetToArrayList(){
        int previousSize = testUser.getOwnedPets().size();


    }
}
