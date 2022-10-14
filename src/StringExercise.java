import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        String string1 = "We don't need no education\n" +
                "We don't need no thought control";
        String string2 = "Check \"this\" out!, \"s inside of \"s!";
        String string3 = "In windows, the main drive is usually C:\\";
        String string4 = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";

        String allString = string1 + "\n" + string2 + "\n" + string3 + "\n" + string4;


        System.out.printf("%s", allString);

    }
}
