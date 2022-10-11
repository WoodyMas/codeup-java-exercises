public class syntaxLecture {
    public static void main(String[] args) {
        // Declare variable without initializing
        int weight;
        String breed;

        // Initializing after declaration;
        weight = 12;
        breed = "Cavalier King Charles Spaniel";

        // Initialize and declare at the same time
        String name = "Mac Boi";
        int cutenessFactor = 10;

        // boolean is a primitive data type like number so it isn't capitalized (as opposed to String, which is an object)

        //  boolean isDog = true;

        // Statement: "JVM, do something"
        System.out.println(name + " is a " + breed + ".");

        // Conditional logic
        if (cutenessFactor > 8){
            System.out.println(name + "is cute.");

        } else {
            System.out.println(name + " needs to work on cuteness.");
        }

        // There are 8 primitive data types in Java
        // byte, short, int, long, float, double, char, boolean
        // These primitive data types need to be declared in variable initialization

        boolean isGrinchCute = true;
        char oneLetter = 'a';
        byte smallNum; // bytes go from -128 to 127
        short mediumNum; // -32768 to 32767
        int number; // integers go from -2 billion to 2 billion
        long bigNum; // long goes about -9 quadrillion to 9 quadrillion

        // number = 2000000000;
        // smallNum = (byte) number;
        // System.out.println(smallNum);

        // bigNum = 9000000000000L;

        // casting is the conversion of a value from one data type to another

//        float imaFloat = 2.34F;
//        double imaDouble = 9.01234567890123;
//        System.out.println(imaDouble);
//
//        imaFloat = (float) imaDouble; // variable = (new-data-type) otherVariable is cast syntax
//        System.out.println(imaFloat);
//
//        System.out.println((int) Math.pow(2, 3));

// ###################################### Exercises #########################################

        //Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 37;

        //Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString;
        // System.out.println(myString);
        // myString must be initialized in order to print;

        //Change your code to assign a character value to myString. What do you notice?
        myString = "This is my string";

        //Change your code to assign the value 3.14159 to myString. What happens?
        // myString = 3.14159;
        // myString cannot contain a number type without casting

        //Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

//         long myNumber;
        // System.out.println(myNumber);
        // variables must be initialized in order to print to system

//        String myNum;
//        myNum = "3";
//        int myNewNum = (int) myNum;
//        System.out.println(myNewNum);
        // It don't work



    }
}
