package vehicles;



public class Car extends Vehicle {

    public Car(String name,String fuelType,String travelType,boolean publicTravel, int noOfWheels,int maxOfOccupants){
        super(name,fuelType,travelType,publicTravel,noOfWheels,maxOfOccupants);

    }

    // Abstract Method : The subclass can only extend to one class.
    @Override
    public String engineNoise(){
        return "Vooooom!";
    }

    // Interface method - We can have more one interface (i.e for each vehicle);
    public String maxSpeed(int speed){
        return this.name + " has a Max Speed of " + speed + "mph";
    }












}
