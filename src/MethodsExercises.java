import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println("10 + 20 = " + addition(10, 20));
//        System.out.println("15 - 5 = " + subtraction(15, 5));
//        System.out.println("5 * 7 = " + multiplication(5, 7));
//        System.out.println("40 / 5 = " + division(40, 5));
//        System.out.println("50 % 5 = " + modulus(50, 5));
//        getInteger(50, 90);
//        getIntegerRecursion(1, 50);
        int get = getIntegerRecursion(1, 10);
        int fact = calculateFactorial(get);
        System.out.println(fact);
        rollDice();


    } // End main

        // Addition
        public static int addition (int input, int input2) {
            return input + input2;
        } // End Addition

        // Subtraction
        public static int subtraction (int input, int input2) {
            return input - input2;
        } // End Subtraction

        // Multiplication
        public static int multiplication (int input, int input2) {
            return input * input2;
        } // End Multiplication

        // Division
        public static double division (double input, double input2) {
            return input / input2;
        } // End Division

        // Modulus
        public static int modulus (int input, int input2){
            return input % input2;
        } // End Modulus

        public static int calculateFactorial (int userInput){
//            Scanner scanner = new Scanner(System.in);
//            userInput = Integer.parseInt(scanner.nextLine());
//
//            System.out.printf("You chose %d%n", userInput);
            int count = 1;
            for (int i = 1; i < userInput+1; i++){
                count *= i;
            }
            return count;
        }


        public static int getInteger(int min, int max) {
        // Create a method that validates that user input is in a certain range and returns that input as an integer
        // if it is within the given range. If not, prompt the user to input their number again until the input is within range.
        // The method signature should look like this:
        // public static int getInteger(int min, int max);
            // declare userInput as an integer. This will make comparing it to min and max possible
            int userInput = 0; // we'll start with 0, though it will be re-assigned during the loop

            // Declare an empty string (this will be used as the breaking condition for the loop.
            // We will re-assign its value when userInput is between min and max)
            String continueLoop = "";

                // While continueLoop is an empty string,
                while (continueLoop.equals("")){
                    // We will scan
                    Scanner scanner = new Scanner(System.in);
                    System.out.printf("Enter an integer within the range of %d - %d%n", min, max);
                        // We are scanning for userInput
                    userInput = Integer.parseInt(scanner.next());

                    // Check to see if userInput is between min and max
                    if (userInput >= min && userInput <= max) {
                        System.out.printf("Your input: %d is between the range of %d - %d%n", userInput, min, max);
                        continueLoop = "n";
                    } else {
                        // If userInput isn't in the range, we'll display a try again message and the loop will continue
                        // because the continueLoop string has not been re-assigned
                        System.out.printf("Your input: %d is NOT between the range of %d - %d%n", userInput, min, max);
                    }
                } // End While loop

            return userInput;

        } // End getInteger old method

        // getInteger Recursion method
        public static int getIntegerRecursion (int min, int max){
            Scanner scanner = new Scanner(System.in);
            int userInput = 0;
            System.out.printf("Let's use some recursion. Enter a number between %d-%d%n", min, max);
            userInput = Integer.parseInt(scanner.nextLine());
            if (userInput >= min && userInput <= max){
                System.out.printf("Your number %d is acceptable, as it is within the range of %d-%d%n", userInput, min, max);
                return userInput;
            } else {
                System.out.printf("Your number %d is NOT accepted, as it is NOT within the range of %d-%d%n", userInput, min, max);
                return getIntegerRecursion(min, max);
            }
        } // End getIntegerRecursion

        public static long  generateRandomNum (int max){
            return Math.round(Math.random() * max);
        }

        //Create an application that simulates dice rolling.

    //Ask the user to enter the number of sides for a pair of dice.
        public static void rollDice (){
            Scanner scanner = new Scanner(System.in);
    //Prompt the user to roll the dice.
            System.out.println("How many sides do the dice have?");
            byte numbersOfSides = scanner.nextByte();
            System.out.printf("Your dice have %d sides.%n", numbersOfSides);
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
            System.out.println("Do you want to roll the dice? (y/n)");
            String userChoice = scanner.next();
            while (userChoice.equals("y")) {
                System.out.println("You rolled the dice");

                //Use static methods to implement the method(s) that generate the random numbers.
                //Use the .random method of the java.lang.Math class to generate random numbers.
                System.out.printf("You rolled %d and %d%n",
                        generateRandomNum(numbersOfSides),
                        generateRandomNum(numbersOfSides));
                System.out.printf("Do you want to roll again? (y/n)%n");
                userChoice = scanner.next();
            }



    }
} // Emd MethodsExercises Class
