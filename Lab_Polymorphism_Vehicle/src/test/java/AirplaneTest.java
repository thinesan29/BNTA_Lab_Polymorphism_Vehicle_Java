
import vehicles.Airplane;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirplaneTest {
    Airplane airplane;

    @BeforeEach
    void setUp(){
        airplane = new Airplane("Airbus-A380","Jet Fuel","Air",true,2,300);
    }

    @Test
    void canMakeEngineNoise(){
        assertThat(airplane.engineNoise()).isEqualTo("Woooosh!");
    }



}
