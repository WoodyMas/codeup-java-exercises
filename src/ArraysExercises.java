import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;


public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println("Now we toString");
        System.out.println(Arrays.toString(numbers));

        Person people [];

        people = new Person[3];
        people[0] = new Person("Mason");
        people[1] = new Person("Danny");
        people[2] = new Person("Aaron");

        for (Person name : people){
            System.out.println(name.getName());
        }

        Person test = new Person("Exabiier");

//        System.out.println(Person.addPerson(people, test.txt));

        people = Person.addPerson(people, test);
        Person.addPerson(people, test);
        System.out.println();

        for (Person person: people){
            System.out.println(person.getName());
        }

    }
}
