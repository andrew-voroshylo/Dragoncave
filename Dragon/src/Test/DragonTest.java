package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DragonTest {

    Dragon.DragonCave dragonCave;

    @BeforeEach
    void setUp() {
        dragonCave = new Dragon.DragonCave();
    }

    @Test
    void getSetup(){
        assertEquals(3, dragonCave.getSetup(), "okay");
    }


}
