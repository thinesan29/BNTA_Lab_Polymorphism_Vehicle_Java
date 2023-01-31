package vehicles;
public abstract class Vehicle {

    // Properties
    protected String name;
    private String fuelType;
    private String travelType;

    private boolean publicTravel;

    private int noOfWheels;

    private int maxOfOccupants;

    // Constructors
    public Vehicle(String name,String fuelType,String travelType,boolean publicTravel, int noOfWheels,int maxOfOccupants) {
        this.name = name;
        this.fuelType = fuelType;
        this.travelType = travelType;
        this.publicTravel = publicTravel;
        this.noOfWheels = noOfWheels;
        this.maxOfOccupants = maxOfOccupants;
    }

    // Methods
    public abstract String engineNoise();


    public String getName() {

        return name;
    }

    public String getFuelType() {

        return fuelType;
    }

    public String getTravelType() {

        return travelType;
    }

    public Boolean getPublicTravel() {

        return publicTravel;
    }

    public int getNoOfWheels() {

        return noOfWheels;
    }

    public int getMaxOfOccupants() {

        return maxOfOccupants;
    }



}
