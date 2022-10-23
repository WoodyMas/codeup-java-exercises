package vehicles;

public class Motorcycle extends Vehicle{
    public Motorcycle(){

    }

    public Motorcycle(String name){
        this.setName(name);
    }

    public void makeNoise(){
        System.out.println("BEEEP BEEP HONKY");
    }
}
