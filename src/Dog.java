public class Dog {
    // public is an access modifier
    // Means we can access the class from anywhere in the project


    public static void main(String[] args) {

//        bark();
//        bark(15);
//        bark(50);
//        bark(15, "Appa");
//        bark(55,"Fido");
    }

    public static void bark(){
        // static means ...
        // void means there is no return value
        System.out.println("Woof woof!");
    }

    public static void bark(int weight, String name){
    // Stephen Pflug version
//        System.out.printf("%s goes", name);
//        bark(weight);

    // Old Version
        String output = name + " goes ";
        if (weight < 25){
            output += "yip yip.";
        } else {
            output += "woof woof";
        }
    } // End public static void bark (int weight, String name)

    public static void bark(int weight){
        if (weight < 25) {
            System.out.println(" Yip yip");
        } else {
            System.out.println(" Woof woof");
        }
    }
}
