package vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car dailyCommuter = new Car("Honda Civic");
        Car truck = new Car("Tacoma");
        Car muscleCar = new Car("Challenger");
        Car luxuryVehicle = new Car("Lincoln poopenfarten");




        Vehicle[] garageVehicles = new Vehicle[4];
        garageVehicles[0] = dailyCommuter;
        garageVehicles[1] = truck;
        garageVehicles[2] = muscleCar;
        garageVehicles[3] = luxuryVehicle;
        garage.setVehicles(garageVehicles);
        garage.alarmCascade();

        Vehicle[] garageVehicles2 = {dailyCommuter, truck, muscleCar, luxuryVehicle};
        garage.setVehicles(garageVehicles2);
        garage.alarmCascade();

        garage.getVehicles()[0] = new Motorcycle("Honda Rebel 500");
        System.out.println(garage.getVehicles()[0].getName());


        garage.setVehicles(new Vehicle[4]);

    }

}
