public class Animal {
// =====================================================================================================================
    public String name;
    public String sound;
//    public String call;
    public String adjective;


    // Create a class for your favorite type of animal.
    // The class should be named for your animal - Cat, Dog, Parrot etc.
    // It should have two instance variables - name and sound - and one method - makeNoise().
    // The output of the makeNoise method should be name +  " goes " + sound.
    // Create a test class with a main method to instantiate and test your class code.


    public void makeNoise(){
        System.out.printf("The %s %ss a %s %s%n", name, sound, adjective, sound);
    }

// ================================================== End Class ========================================================
}
