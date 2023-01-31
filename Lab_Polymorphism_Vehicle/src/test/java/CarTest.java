
import vehicles.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CarTest {
    Car car;

    @BeforeEach
    void setUp(){
        car = new Car("Ferrari","Petrol","Land",false,4,2);
    }

    @Test
    void canMakeEngineNoise(){
        assertThat(car.engineNoise()).isEqualTo("Vooooom!");
    }

}
