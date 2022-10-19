public class Fighter {
// =====================================================================================================================
    private String name;
    private int hitPoints;
    private int maxDamage;


    // Setter (hitPoints will be set with this method)
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    // Getter
    public int getHitPoints(int hitPoints){
        return hitPoints;
    }

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

    public Fighter(){

    }

    public Fighter(String name, int hitPoints, int maxDamage){
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }

    public static void main(String[] args) {




    } // End Main



// ================================================== End Class ========================================================
} // End Object-Oriented Lecture Class
