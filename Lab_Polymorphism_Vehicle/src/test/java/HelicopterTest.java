
import vehicles.Airplane;
import vehicles.Helicopter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {
    Helicopter helicopter;

    @BeforeEach
    void setUp(){
        helicopter = new Helicopter("Boeing Model 360","Jet Fuel","Air",false,4,10);
    }

    @Test
    void canMakeEngineNoise(){
        assertThat(helicopter.engineNoise()).isEqualTo("buh buh buh buh !");
    }

}
