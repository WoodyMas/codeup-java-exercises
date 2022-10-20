package vehicles;
import util.Input;
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.makeNoise();

        Motorcycle motorcycle = new Motorcycle();
        System.out.println(motorcycle.getName());
        motorcycle.setName("Harley Davidson");
        System.out.println(motorcycle.getName());
        motorcycle.makeNoise();


    }
}
