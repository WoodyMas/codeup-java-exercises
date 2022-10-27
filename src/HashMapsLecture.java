import rpg.Monster;

import java.util.*;

import static java.util.Map.entry;

// This comment is a test.txt for GitHub

public class HashMapsLecture {
    public static void main(String[] args) {

    Monster orc = new Monster("Orc", 13, 15, 9);
    Monster ogre = new Monster("Ogre", 11, 59, 13);
    Monster goblin = new Monster("Goblin", 5, 10, 7);
    Monster blueDragon = new Monster("Blue Dragon", 30, 100, 35);
    Monster frostGiant = new Monster("Frost Giant", 24, 45, 25);
    Monster werewolf = new Monster("Werewolf", 5, 98, 70);
    Monster orcWarChief = new Monster("Orc War Chief", 16, 93, 15);

    // HashMap<k, V> K is data type of Key, V is data type of value
    HashMap<String, Monster> monsterHashMap = new HashMap<>();

    // Add a key-value pair to the hashmap using .put()
    //                 Key   Value
    monsterHashMap.put("orc", orc);


    //Access a value in the hashmap using .get()
    //             get Key
    System.out.println(monsterHashMap.get("orc"));
    System.out.println(monsterHashMap.get("orc").getHitPoints());

    // Replace a value in the hashMap using .replace()
    monsterHashMap.replace("orc", orcWarChief);
    System.out.println(monsterHashMap.get("orc"));
    System.out.println(monsterHashMap.get("orc").getHitPoints());

    // To add multiple objects to a hashMap at once,
    // use Map.ofEntries()
    Map<String, Monster> intermediateMap = Map.ofEntries(
            entry("blue dragon", blueDragon),
            entry("ogre", ogre),
            entry("frost giant", frostGiant),
            entry("goblin", goblin),
            entry("orc war chief", orcWarChief)
    );
    monsterHashMap.putAll(intermediateMap);

    // Looping over HashMaps Technique 1:
    // use .entrySet to derive a set of entries
    // Each entry is represented as a Map.Entry<DataTypeOfKey, DataTypeOfValue>
    // Once you have an entrySet you can use an enhanced for loop to loop over it
    for (Map.Entry<String, Monster>monsterEntry : monsterHashMap.entrySet()){
        Monster monster = monsterEntry.getValue();
        System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
    }

    // Technique 2:


    // To create a list of specific properties in the objects
    // stored as HashMap values, we can use .keySet().stream().toList()

    List<String> monsterNames = new ArrayList<>(monsterHashMap.keySet().stream().toList());

    // Once I've got a list, I can sort it and do other list things to it
    Collections.sort(monsterNames);
    System.out.println(monsterNames);

    // The strings generated from the keyset are the keys to the HashMap
    // So looping over this list allows me to access all the HashMap entries
    System.out.printf("%n");
    System.out.println("Loop over keySet converted to ");
    for (String monsterName : monsterNames) {
        Monster monster = monsterHashMap.get(monsterName);
        System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
    }

    // Technique 3: the forEach Loop
    System.out.println("\n");
    System.out.println("forEach Loop:");
    monsterHashMap.forEach((key, monster) -> {
        System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
    });

    // Technique 4: treeMap
    // Convert to a TreeMap to sort by Key
        System.out.printf("%n");
    System.out.println("Output of forEach over the TreeMap");
    Map<String, Monster> monsterTreeMap = new TreeMap<>(monsterHashMap);
    monsterTreeMap.forEach((key, monster) ->{
        System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
    });



        System.out.printf("%n");
    Object[] monstersArray = monsterHashMap.values().toArray();
    for (Object monster : monstersArray){
        int hitPoints = ((Monster) monster).getHitPoints();
        System.out.println(hitPoints);
    }

        System.out.printf("%n");
    Monster[] monstersArray2 = monsterHashMap.values().toArray(new Monster[0]);
    for (Monster monster : monstersArray2) {
        System.out.printf("%s has %d hit points ", monster.getName(), monster.getHitPoints());
    }

    }// End Main
} // End HashMapsLecture Class
