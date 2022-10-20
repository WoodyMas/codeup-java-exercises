package vehicles;

public class Vehicle {
    private String name;

    public Vehicle (){

    }

    public Vehicle (String name){
        this.name = name;
    }

    public void alarm(){
        System.out.println("WOOOOOOO WOOOOOOO WOOOOOOOO");
    }
    public void makeNoise(){
        System.out.println("VRROOOOOOMMMMMM VROOOOOM **SCREEEEEECH**");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
