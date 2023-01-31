package hanger;

import vehicles.Vehicle;
import java.util.ArrayList;

public class Hanger {
    private ArrayList<Vehicle> vehicles;

    public Hanger(){
        this.vehicles = new ArrayList<>();

    }

    public int countVehicles(){
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

}
