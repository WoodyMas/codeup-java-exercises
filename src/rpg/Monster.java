package rpg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Monster  implements Comparator<Monster> {

    private String name;
    private int armorClass;
    private int hitPoints;
    private int damage;

    public String getName() {
        return name;
    }

    // To create a custom comparison method, we implement Comparable<ObjectClassName> in the object class.
    // We use this syntax:

    public int compare(Monster m1, Monster m2){
        return Integer.compare(m2.getHitPoints(), m1.getHitPoints());
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String toString(){
        return name;
    }

//    public static void generateMonster

    public Monster(){}

    public Monster(String name, int armorClass, int hitPoints, int damage) {
        this.name = name;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }
}
