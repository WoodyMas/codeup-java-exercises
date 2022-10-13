import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Problem 1%n");
        // Create a while loop that starts at 5 and increments until 15. Your output should look like this:
        //5 6 7 8 9 10 11 12 13 14 15
        int prob1 = 5;

        while (prob1 <= 15){
            System.out.printf("%s, " ,prob1++);
        }

        System.out.printf("%n%nProblem 2%n");
        // Do While
        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int prob2 = 0;
        do {
            System.out.printf("%s, ", prob2);
            prob2 += 2;
//            System.out.println(prob2);

        } while (prob2 < 100);

        // Alter your loop to count backwards by 5's from 100 to -10.

        System.out.printf("%n%nProblem 3%n");
        int prob3 = 100;
        do {
            prob3 -= 5;
            System.out.printf("%s, ", prob3);

        } while (prob3 > -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536

    int prob4 = 2;
        System.out.printf("%n%nProblem 4%n");
        System.out.println("Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.");
        System.out.println("Output should equal: 2, 4, 16, 256, 65536\n");
    do {
        System.out.println(prob4);
        prob4 = (int) Math.pow(prob4, 2);
    } while (prob4 < 1000000);

        //Loop Basics

        //Create an integer variable i with a value of 5.
        //Create a for loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15

    System.out.printf("%nProblem 5 %n%n");
    System.out.println("Create a for loop that runs so long as i is less than or equal to 15.\n");
    System.out.println("Your output should look like:\n5 6 7 8 9 10 11 12 13 14 15\n");

    for (int i = 5; i <= 15; i++) {
        System.out.printf("%d ", i);
    }
    System.out.println();


        //Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        // Write a program that prints the numbers from 1 to 100.
        // For multiples of three: print “Fizz” instead of the number.
        // For the multiples of five: print “Buzz”.
        // For numbers which are multiples of both three and five: print “FizzBuzz”.

    System.out.printf("%nProblem 6 %n%n");
    System.out.println("Program will run from 1 - 100. For multiples of 3 and 5, output Fizzbuzz, for 3 output fizz, for 5 output buzz. otherwise it'll print i\n");


    for (int i = 1; i <=100; i++) {
        if (i %3 == 0 && i %5 == 0) {
            System.out.printf("\nFizzBuzz, ");
        } else if (i %5 == 0) {
            System.out.printf("Buzz, ");
        } else if (i % 3 == 0) {
            System.out.printf("Fizz, ");
        } else {
            System.out.printf("%d, ", i);
        }
    }

        System.out.printf("%n%nProblem 7 %n%n");

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
                for (int j = 0; j <= integerNext; j++) { // This loop displays all numbers between 0 and integerNext
                    int numberSquared = (int) Math.pow(j, 2);
                    int numberCubed = (int) Math.pow (j, 3);
                    // System.out.printf("number  | squared | cubed %n------- | ------- | ------%n");


                    message = j + "     | " + numberSquared + "   | " + numberCubed;
                    System.out.println(message);
                }
                // Blank space
                System.out.println();

                // see if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();
            }
        }
        System.out.printf("%nProblem 8 & bonus %n%n");
        String userPrompt = "y";

        while (userPrompt.equalsIgnoreCase("y")){
            // get the input from the user
            System.out.println("Enter a grade: "); // Starting message
            int integerNext = sc.nextInt(); // User int

            //A : 100 - 88
            //B : 87 - 80
            //C : 79 - 67
            //D : 66 - 60
            //F : 59 - 0

            String gradeA = "    A  :  100 - 88";
            String gradeB = "    B  :  87 - 80 ";
            String gradeC = "    C  :  79 - 67 ";
            String gradeD = "    D  :  66 - 60 ";
            String gradeF = "    F  :  59 -  0 ";

            String gradeAPlus = "    A+ :  99 , 100";  //  99, 100
            String gradeBPlus = "    B+ :  87 - 86 ";  // 86, 87
            String gradeCPlus = "    C+ :  79 - 78 ";  // 78, 79
            String gradeDPlus = "    D+ :  66       "; // 66

//            String gradeAMinus = "    A- :  90 - 88";   //  99, 100
//            String gradeCMinus = "    C- :  70 - 67 ";  // 78, 79
//            String gradeBMinus = "    B- :  83 - 80 ";  // 86, 87
//            String gradeDMinus = "    D- :  60       "; // 66


            System.out.println(" Grade :" + "  " + " Range :"); // First row
            System.out.println("========" + "  " + "========"); // Row separator

            // If grade is within A range
            if (integerNext >= 88 && integerNext <= 100){
                // If grade is 99 or higher (A+ range)
                if (integerNext >= 99){
                    // Print A+
                    System.out.println(gradeAPlus);
                }
                // Print Grade A regardless
                else {
                    System.out.println(gradeA);
                }

            // If grade is in B range
            } else if (integerNext >= 80 && integerNext <= 87) {
                // If grade is 86 or higher but within 88 (B+ range)
                if (integerNext >= 86 && integerNext < 88){
                    // Print B+
                    System.out.println(gradeBPlus);
                }
                // Print Grade B regardless
                else {
                    System.out.println(gradeB);
                }

            // If grade is in C range
            } else if (integerNext >= 67 && integerNext <= 79) {
                // If grade is within 78 - 79 (C+ Range)
                if (integerNext >= 78 && integerNext < 80){
                    System.out.println(gradeCPlus);
                }
                else {
                    System.out.println(gradeC);
                }

            // If grade is in D range (66 - 60)
            } else if (integerNext >= 60 && integerNext <= 66) {
                if (integerNext == 66){
                    System.out.println(gradeDPlus);
                }
                else {
                    System.out.println(gradeD);
                }
            } else {
                System.out.println(gradeF);
            }

//            System.out.println("Would you like to see the entire Grade Chart?");


            System.out.println("Continue?");
            userPrompt = sc.next();
            System.out.println();
        }

        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0
        //Bonus
        //
        //Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

    } // Main
} // Class