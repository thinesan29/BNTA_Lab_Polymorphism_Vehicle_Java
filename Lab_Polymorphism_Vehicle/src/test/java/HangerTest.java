import vehicles.AirTransport;
import vehicles.Car;
import vehicles.Airplane;
import vehicles.Helicopter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hanger.Hanger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HangerTest {
    Hanger hanger;

    @BeforeEach
    void setUp(){
        hanger = new Hanger();
    }

    @Test
    void canCountVehicles(){
        assertThat(hanger.countVehicles()).isEqualTo(0);
    }

    @Test
    void canAddVehicles(){
        Car car = new Car("Ferrari","Petrol","Land",false,4,2);
        hanger.addVehicle(car);
        assertThat(hanger.countVehicles()).isEqualTo(1);
    }

    @Test
    void canAddDifferentTypesOfVehicles(){
        Car car = new Car("Ferrari","Petrol","Land",false,4,2);
        Airplane airplane = new Airplane("Airbus-A380","Jet Fuel","Air",true,2,300);
        Helicopter helicopter = new Helicopter("Boeing Model 360","Jet Fuel","Air",false,4,10);
        hanger.addVehicle(car);
        hanger.addVehicle(airplane);
        hanger.addVehicle(helicopter);
        assertThat(hanger.countVehicles()).isEqualTo(3);
    }




}
