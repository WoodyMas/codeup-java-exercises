public class Fighter {
// =====================================================================================================================
    public String name;
    public int hitPoints;
    public int maxDamage;

    public int attackRoll(){
//        D20 d20 = new D20(); // We don't have to do this with the code below
        return D20.rollD20();
    }

    public void printStats(){
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints, maxDamage);
    }

    public void battleRoar(){
        System.out.printf("I am %s and I will destroy you%n", name);
    }



    public static void main(String[] args) {




    } // End Main



// ================================================== End Class ========================================================
} // End Object-Oriented Lecture Class
