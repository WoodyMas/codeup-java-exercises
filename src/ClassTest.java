public class ClassTest {
    public static void main(String[] args) {
//        rpg.Fighter fighter1 = new rpg.Fighter(); // We are constructing a new instance of the rpg.Fighter class (using the new method)
//        fighter1.name = "Gheedruh";
//        fighter1.hitPoints = 17;
//        fighter1.maxDamage = 14;
//        fighter1.printStats();
//        fighter1.battleRoar();
//        int fighter1attackRoll = fighter1.attackRoll();
//        System.out.printf(" %s attacks and rolls a %d%n", fighter1.name, fighter1attackRoll);
//
//        rpg.Fighter fighter2 = new rpg.Fighter();
//
//        animals.Animal animal1 = new animals.Animal();
//        animal1.name = "Cat";
//        animal1.sound = "meow";
//        animal1.adjective = "piercing";
//        animal1.makeNoise();
//
//        animals.Animal animal2 = new animals.Animal();
//        animal2.name = "Cat";
////        animal2.sound = "TestSound";
//        animal2.adjective = "apathetically";
//        animal2.sound = Quote.randomQuoteNumber();
//
//        System.out.printf("The %s says %s %s", animal2.name, animal2.sound, animal2.adjective);

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.name = "Pablo";
        employee2.name = "Escobar";
        employee3.name = "Checo";
        System.out.println(employee1.displayEmployeeInfo());
        System.out.println(employee2.displayEmployeeInfo());
        System.out.println(employee3.displayEmployeeInfo());

//        System.out.println(Employee.company);
//        rpg.Fighter fighter3 = new rpg.Fighter("Mac Krweqk", 8, 12);
//        fighter3.printStats();

    }




}
