import rpg.Monster;

import java.util.*;

public class CollectionsLecture {
    public static void main(String[] args) {
        ArrayList<Monster> monsterArrayList = new ArrayList<>();
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster goblin = new Monster("Goblin", 5, 10, 7);
        Monster blueDragon = new Monster("Blue Dragon", 30, 100, 35);
        Monster frostGiant = new Monster("Frost Giant", 24, 45, 25);
        Monster werewolf = new Monster("Werewolf", 5, 98, 70);


        monsterArrayList.add(orc);
        System.out.println(monsterArrayList.size());
        System.out.println(monsterArrayList.get(0)); // use .get(index) to get reference to object (Monster object)
        System.out.println(monsterArrayList.get(0).getArmorClass());
        monsterArrayList.add(ogre); // Old monsterArrayList contains Orc and Ogre

        System.out.println(monsterArrayList.size());

        // newMonsterArrayList contains goblin, blueDragon, frostGiant, werewolf
        List<Monster> newMonsterList = new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf));
        System.out.println(newMonsterList);
        System.out.println(monsterArrayList);


        // add all the new Monsters to the monsterArrayList
        monsterArrayList.addAll(newMonsterList); // monsterArrayList will now contain Orc, Ogre, goblin, blueDragon, frostGiant, and werewolf;
        System.out.println(monsterArrayList);
        // .add() only adds one element to an existing arrayList
        // .addAll() adds multiple objects to an existing arrayList all at once
        System.out.printf("%n");

        // Loop over arrayLists
        // traditional for loop
        for (int i = 0; i < monsterArrayList.size(); i++) { // We use .size instead of .length for arrayLists
            System.out.println(monsterArrayList.get(i)); // Use .get(i) instead of [i] for arrayLists
        }
        System.out.printf("%n");



        // Enhanced for loop
        // (Object variableName : specifiedArrayList) {
            // loop command
        // }
        System.out.println("Let's get the monster's HP");
        for (Monster monster : monsterArrayList){
            System.out.println(monster.getHitPoints());
        }
        System.out.println("\n");

        // traditional for loop has a little more flexibility than the enhanced, though the enhanced for loop requires less syntax, and is faster to implement
        System.out.println("Let's use the traditional for loop to display the names on a single line.");
        for (int i = 0; i < monsterArrayList.size(); i++){
            if (i == monsterArrayList.size() -1){
                System.out.printf("%s%n", monsterArrayList.get(i));
            } else {
                System.out.printf("%s, ", monsterArrayList.get(i));
            }
        }
        System.out.println("The traditional loop allows more flexibility than the enhanced for loop, though the enhanced for loop requires less syntax and is faster to implement\n");

        // Must use Integer instead of int because ArrayLists use objects for data types
        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(1, 5, 9, 11, 89,34, -67, 23, 45, 3));
        System.out.println(myNumbers);
        Collections.sort(myNumbers); // Collections.sort() doesn't create a new arrayList, it mutates the selected arrayList
        System.out.println(myNumbers);

        System.out.println("\n");

        // String is already an object, and is not a primitive data type so the ArrayList is ready to be used
        ArrayList<String> randomWords = new ArrayList<>(List.of("Bro", "Guy", "Fella", "Buddy", "Pal", "Friend"));
        System.out.println(randomWords);
        Collections.sort(randomWords);
        System.out.println(randomWords);
        System.out.printf("%n");

        // monsterArrayList.sort(Comparator.comparing(Monster::getHitPoints));
        System.out.println("monsterArrayList in its original order");
        System.out.println(monsterArrayList);
        System.out.println("\nmonsterArrayList after monsterArrayList.sort(Comparator.comparing(Monster::getHitPoints));");
        monsterArrayList.sort(Comparator.comparing(Monster::getHitPoints));
        System.out.println(monsterArrayList);
        System.out.println("Each monster is sorted in ascending order by the HitPoints.");

        // To use the compare() method that we wrote in the Monster class, we use
        // the sort method and pass it a no-arg constructor
        monsterArrayList.sort(new Monster());
        System.out.println(monsterArrayList);


    } // End Main

} // End CollectionsLecture Class
