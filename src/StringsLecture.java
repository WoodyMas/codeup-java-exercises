import java.awt.*;
import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
//        String teacher = "teacher";
//        teacher = "not teacher";
//        Scanner scanner = new Scanner(System.in);
//        String newText = "newText";

        String javier = "Javier";

        System.out.println(Integer.toHexString(System.identityHashCode(javier)));

        String alsoJavier = "Javier";

        System.out.println(Integer.toHexString(System.identityHashCode(alsoJavier)));

        javier = javier + " Ruedas";

        Scanner scanner = new Scanner(System.in);
        System.out.println(javier);
        System.out.println("What's your name?");
        String userName = scanner.nextLine();
        System.out.println( "Test " + (userName == javier));
        System.out.println(javier.equals(userName));



    }
}
