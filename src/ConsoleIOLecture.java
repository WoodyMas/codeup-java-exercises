// To use Scanner, must import
import java.util.Scanner;


public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Weywot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F;
//        System.out.printf("Hello, %s", cohort);
//        System.out.println("Will this be on a separate line?");
//        System.out.println("How about this?");
//
//        System.out.printf("Good %s, %s! we are on week %d%n", timeOfDay, cohort, week);
//        System.out.printf("The number is %011.2f%n", someNumber);
//        System.out.printf("The number is %-11.2f%n", someNumber);
//        System.out.printf("The number is %-11.2f test.txt%n", someNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNumber = Integer.parseInt((scanner.nextLine()));
        System.out.printf("Your number is %d.%n", userNumber);

        System.out.println("Enter a word or phrase:");
        String userInput = scanner.nextLine();
        System.out.printf("Your phrase was %s.%n", userInput);

//        System.out.println("Enter a word:");


    }
}
