package vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car dailyCommuter = new Car("Honda Civic");
        Car truck = new Car("Tacoma");
        Car muscleCar = new Car("Challenger");
        Car luxuryVehicle = new Car("Lincoln poopenfarten");


        garage.setVehicles(new Vehicle[4]);
    }

}
