package vehicles;

public abstract class AirTransport extends Vehicle{

        public AirTransport(String name,String fuelType,String travelType,boolean publicTravel, int noOfWheels,int maxOfOccupants){
                super(name,fuelType,travelType,publicTravel,noOfWheels,maxOfOccupants);

        }

        // Methods
        public abstract String engineNoise();


}
