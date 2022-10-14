import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        // Any question needs to respond with the answer "sure", and "Whoa, chill out!" if user input ends with an exclamation mark
        // Empty inputs will be responded with "Fine. Be that way!"
        // Any other input will be responded with "Whatever."

        // need a scanner so we can accept user input
        String userInput, conversations = "";
        Scanner scanner = new Scanner(System.in);
//        while ()
//        {
        System.out.println("What do you want?");
        while (conversations.equals("")) {
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.endsWith("?") && !userInput.startsWith("how")) {
                System.out.println("Sure.");
            } else if (userInput.equals("") || userInput.equals("...") || userInput.equals("bye")) {
                System.out.println("Fine. Be that way!");
                conversations = "end";

            } else {
                System.out.println("Whatever.");
            }
        }
//        }

//        System.out.println(customerChoice);



    } // End Main
} // End Bob Class
