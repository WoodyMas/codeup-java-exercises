package practiceTest;





////    //10. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
////    //11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
////    //12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
////    //12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.

public class PetDog extends Pet implements Companion{

// ============================================= Variable ==============================================================
    public boolean trained;

// ============================================= Constructor ===========================================================
    // Default
    PetDog() {

    }

    PetDog(String name, String type, boolean trained){
        this.name = name;
        this.type = type;
        this.trained = trained;
    }

// ============================================= Methods ===============================================================


    public boolean isTrained() {
        return trained;
    }


    @Override
    public String Snuggle() {
        return null;
    }

    public String Snuggle (String name) {
        return name + " wants to snuggle";
    }

}
