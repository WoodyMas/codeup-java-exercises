package practiceTest;



//    //6. Create a PetDog class that inherits from Pet.
//    //7. In PetDog, create a boolean instance variable, trained.
//    //8. Write a constructor for PetDog that sets its name, type, and trained properties.
//    //9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
//    //10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
//    //11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
//    //12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
//    //12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.

public class Pet {
    // =============================================== Variable ========================================================
    public String name;
    public String type;

    public int age;

    // =============================================== Constructor ========================================================
    // Default Constructor
    Pet() {

    }

    Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    Pet(String name) {
        this.name = name;
    }
    Pet (String name, String type){
        setName(name);
        setType(type);

    }
    Pet (int age) {
        this.age = age;
    }

// =============================================== Methods ========================================================
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
