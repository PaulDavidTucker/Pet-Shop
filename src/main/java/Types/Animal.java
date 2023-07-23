package Types;

/*
    Superclass for Dog, Cat and other animals.
    @Author Paul Tucker

 */
public abstract class Animal {

    private Breed breed;
    private Integer age;
    private String name;
    private double weight;
    private Owner owner;

    public Breed getBreed() {
        return breed;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public Animal(Breed breed, Integer age, String name, double weight, Owner owner) {
        this.breed = breed;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.owner = owner;
    }

    /*
        Sets the current owner of this pet to given owner
     */
    public void assignPetToOwner(Owner assignee){
        this.owner = assignee;
        this.owner.addNewPetToCurrentlyOwnedList(this);
    }

    public void removePetFromOwner() throws Exception{
        try{
            this.owner.removePetFromCurrentList(this);
        }catch (Exception e){
            System.out.println("[ERROR] - Owner does not own this pet");
            throw new Exception();
        }

    }


}
