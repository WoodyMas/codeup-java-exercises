import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        // The value of pi is approximately 3.14.
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        // Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int userNumber = Integer.parseInt((scanner.nextLine()));
        System.out.printf("Your integer is %d.%n", userNumber);
            // When putting something that isn't an integer as userNumber, errors populate:
            // Exception in thread "main" java.lang.NumberFormatException: For input string: "3.44"
            //	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            //	at java.base/java.lang.Integer.parseInt(Integer.java:665)
            //	at java.base/java.lang.Integer.parseInt(Integer.java:781)
            //	at ConsoleExercises.main(ConsoleExercises.java:12)

        //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        System.out.println("Enter three words");
        String userFirstWord = scanner.next();
        String userSecondWord = scanner.next();
        String userThirdWord = scanner.nextLine();
        System.out.printf("Your three words are: %s, %s, %s.%n", userFirstWord, userSecondWord, userThirdWord);
            // The console kept adding breaks to search for the third word. If I clicked Enter, it didn't matter. It would not store the values until there were three strings
            // When 4 words are entered, only the first three words are returned

        System.out.println("Enter a sentence:");
        String userSentence = scanner.nextLine();
        System.out.printf("Your sentence:%n %s.%n", userSentence);
        // Need to find a way to stop it from taking Enter as the userSentence


        System.out.println("Enter the length of the classroom:");
        int classroomLength = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of the classroom");
        int classroomWidth = Integer.parseInt(scanner.nextLine());

        int classroomArea = (classroomLength * classroomWidth);
        int classroomPerimeter = ((2 * classroomLength) + (2 * classroomWidth));

        System.out.println("The classroom area is " + classroomArea + " and the classroom perimeter is " + classroomPerimeter);



    }
}
