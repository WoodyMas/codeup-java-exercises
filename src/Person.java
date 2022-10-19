import java.util.Scanner;


public class Person {
    private String name;

    Person(){

    }

    Person (String name){
        this.name = name;
    }

    public String getName(){
    //TODO: return the person's name
        return name;
    }

    public void setName(String name){
    //TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.printf("Hello %s", this.name);
    }


    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static Person[] addPerson (Person[] oldArr, Person newPerson){
        // Specify Person [] data type
        // Arg 1 is an old array, so we specify that data type (Person[] oldArr)
        // Arg 2 is a new instance of the class (Person newPerson)


        // Create a new variable for the new Array, use Person[] for the data type and assign it to a new Person[old length-1]
        Person[] newArr = new Person[oldArr.length+1];

        // loop through the old array
        for (int i = 0; i < oldArr.length; i++){
            // re-assign the new array's index as the old array's value;
            newArr[i] = oldArr[i];

            // add newPerson to the end of new array, which is at the end of old array

            // {1, 2, 3}
            // {1, 2, 3, 4}

            if (i == oldArr.length-1){
                newArr[newArr.length-1] = newPerson;
            }
        }
        // re-assign old array as the new, so we don't have multiple arrays
        oldArr = newArr;

        // return old
        return oldArr;
    }


} // End Person Class
