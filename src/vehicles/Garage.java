package vehicles;

public class Garage {
    private Vehicle[] vehicles;

    public void alarmCascade(){
        for (Vehicle vehicle: vehicles){
            vehicle.alarm();
        }
    }

//    public void alarmCascade(Vehicle[] vehicles){
//        for (Vehicle vehicle: vehicles){
//            vehicle.alarm();
//        }
//
//    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
}
