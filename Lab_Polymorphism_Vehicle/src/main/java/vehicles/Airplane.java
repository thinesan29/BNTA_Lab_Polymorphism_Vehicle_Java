package vehicles;

public class Airplane extends AirTransport{


    public Airplane(String name,String fuelType,String travelType,boolean publicTravel, int noOfWheels,int maxOfOccupants){
        super(name,fuelType,travelType,publicTravel,noOfWheels,maxOfOccupants);

    }

    // Abstract Method : The subclass can only extend to one class.
    @Override
    public String engineNoise(){
        return "Woooosh!";
    }

    // Interface method - We can have more one interface (i.e for each vehicle);
    public String maxSpeed(int speed){
        return this.name + " has a Max Speed of " + speed + "mph";
    }

    // OverLoad Method:
    public void takeOff() {
        System.out.println("Airplane takes off.");
    }
    public void takeOff(int runWayLength) {
        System.out.println(this.getName() + " takes off using 2 engines with a runway length of " + runWayLength +"m.");

    }




}
