import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // While
        //
        // Create an integer variable i with a value of 5.
        // Create a while loop that runs so long as i is less than or equal to 15
        // Each loop iteration, output the current value of i, then increment i by one.
        // Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        int j = 0;
//        int l = 100;
//
//        while (i <= 15){
//            System.out.println(i++);
//        }

        // Do While
        //
        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        System.out.printf("%n%n");
//        do {
//            System.out.println(j);
//            j += 2;
//            System.out.println(j);
//
//        } while (j < 100);

        // Alter your loop to count backwards by 5's from 100 to -10.


//        System.out.printf("%n%n");
//        do {
////            System.out.println(l);
//            l -= 5;
//            System.out.println(l);
//
//        } while (l > -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536

//    double l = 2;
//    do {
//        System.out.println(l);
//        l *= l;
//    } while (l < 1000000);

        //Loop Basics
        //
        //
        //Create an integer variable i with a value of 5.
        //Create a for loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15

//for (int i = 5; i <= 15; i++) {
//    System.out.printf("%d ", i);
//}
//System.out.println();


        //Create a for loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        //Alter your loop to count backwards by 5's from 100 to -10.
        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536

//System.out.println();
//for (double i = 2; i < 1000000; i *= i) {
//    System.out.println(i);
//}
//System.out.println();

        //Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        // Write a program that prints the numbers from 1 to 100.
        // For multiples of three: print “Fizz” instead of the number.
        // For the multiples of five: print “Buzz”.
        // For numbers which are multiples of both three and five: print “FizzBuzz”.

//for (double i = 1; i <=100; i++) {
//    if (i %3 == 0 && i %5 == 0) {
//        System.out.println("FizzBuzz");
//    } else if (i %5 == 0) {
//        System.out.println("Buzz");
//    } else if (i % 3 == 0) {
//        System.out.println("Fizz");
//    } else {
//        System.out.println(i);
//    }
//}

        //Display a table of powers.
        //
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.

//        System.out.println("Enter a max value:");
//        int userNumber = Integer.parseInt((scanner.nextLine()));
//        System.out.println("Your number is " + userNumber);
//
//
//
//        System.out.printf("number  | squared | cubed %n------- | ------- | ------%n");
//        System.out.printf("%s", userNumber);
//
//
//        System.out.println("Welcome to the Squares and Cubes Table");
//        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while(choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.println("Enter an Integer: "); // Starting message
            int integerNext = sc.nextInt(); // User int

            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed"); // First row
            System.out.println("======" + "  " + "======" + "  " + "======"); // Row separator

            for(int i = 1; i <= integerNext; i++) // i iterates until integerNext (user int) is either met or exceeded
            {
                i = integerNext;


                String message;
                for (int j = 0; j <= integerNext; j++) {
                    int numberSquared = (int) Math.pow(j, 2);
                    int numberCubed = (int) Math.pow (j, 3);
                    message = "\n" + j + "       " + numberSquared + "       " + numberCubed;
                    System.out.println(message);
                }

//                System.out.println(message);
                System.out.println();

                // see if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();
            }
        }


    } // Main
} // Class