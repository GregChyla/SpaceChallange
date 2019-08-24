import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {
    @Test
    public void simTest() {

        Simulation simulation = new Simulation();

        int rocketLoad = simulation.loadU1(simulation.itemArrayList);

        assertEquals(4, rocketLoad);
    }


}