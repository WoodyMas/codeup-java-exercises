import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Person person = new Person();
//        person1.returnInstance();
        person.setName("Mack Krweqk");
//        person1.getName();
        person.sayHello();


    }

    Person(){

    }

    Person (String name){
        this.name = name;
    }

    private static String name;

    public static String returnInstance (){
        System.out.printf("name %s", Person.name);
        return "Yoor";
    }


    public String getName(){
    //TODO: return the person's name
        return Person.name;
    }

    public void setName(String name){
    //TODO: change the name field to the passed value
        Person.name = name;
    }
    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.printf("Hello %s", Person.name);
    }

} // End Person Class
