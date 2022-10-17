import java.util.Scanner;

public class Person {
    public static void main(String[] args) {

    }


    private static String name;

    public String getName(){
    //TODO: return the person's name
        return Person.name;
    }

    public void setName(String name){
    //TODO: change the name field to the passed value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set your name.");
        name = scanner.nextLine();
        Person.name = name;
    }
    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.printf("Hello %s", getName());
    }

} // End Person Class
