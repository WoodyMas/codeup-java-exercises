import java.util.Scanner;

public class ControlStatementsLecture {
    public static void main(String[] args) {
//        int myInteger = 20;
        int x = 5;

        // if statements look familiar.
        // There is no "===" in Java. This is because every variable's data type is explicitly defined.
        if (x==5){
            System.out.println("x is 5");
        }  else if (x > 5 && x < 15) {
            System.out.println("x is between 5 and 15");
        }else {
            System.out.println("x is not 5");
        }

        // What about Switch Statements?
        String customerChoice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What flavor do you want?");
        customerChoice = scanner.next().toLowerCase();

        // traditional switch statement
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("strawberry coming right up");
//                break;
//            default:
//                System.out.println("We don't have that");
//                break;
//        }

        // enhanced switch statement
        switch (customerChoice) {
            case "vanilla" -> System.out.println("One vanilla coming right up");
            case "chocolate" -> System.out.println("chocolate coming right up");
            case "strawberry" -> System.out.println("strawberry coming right up");
            default -> System.out.println("We don't have that");
        }

        int c = 0, d = 100, e = 50;
        if (c == 1 && e++ < 100){
            // because one of the conditions is false while using the && operator, the entire condition expression is false.
            // therefore the e++ < 100 evaluation is short-circuited, meaning it's not evaluated.
            // If both conditions were true, the condition would re-assign e's value to 51. Since it's false, e is still 50.
        }
        System.out.println("e = " + e);
        boolean existence = true;
        int theAnswer = 42;

        if (existence || theAnswer++ == 42){
            // existence is true, and therefore the entire expression is determined as true because it's using the || operator
            // theAnswer should therefore be 42, and not be incremented as it is short-circuited.
        }
        System.out.println(theAnswer);

        int i = 1;
        System.out.println("The loop hasn't started yet. The value of i is " + i);

//        while (i < 10){
//            System.out.println("In the loop. i has not incremented yet and its value is " + i);
//            i++;
//            System.out.println("Still in the loop, i has incremented and its value is " + i);
//        }
//        System.out.println("The loop has ended because the conditional has tested false. The value of i is " + i);
//        if (existence) System.out.println("Yes");

//        for (i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

    }
}
