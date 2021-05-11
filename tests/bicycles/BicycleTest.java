package bicycles;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.*;

public class BicycleTest {

    @Test
    public void shouldAccelerateForRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }
    @Test
    public void shouldBrakeForRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.brake();
        assertEquals(-4, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateAndBrakeCorrectlyForRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());

    }

    @Test
    public void shouldBeAbleToStopForRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }
    @Test
    public void shouldAccelerateForMountainBike() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }
    @Test
    public void shouldBrakeForMountainBike() {
        MountainBike bicycle = new MountainBike();
        bicycle.brake();
        assertEquals(-3, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateAndBrakeCorrectlyForMountainBike() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed());

    }
    @Test
    public void shouldBeAbleToStopForMountainBike() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }

    @Test
    public void shouldAccelerateForTandemBike() {
        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(12, bicycle.currentSpeed());
    }
    @Test
    public void shouldBrakeForTandemBike() {
        Tandem bicycle = new Tandem();
        bicycle.brake();
        assertEquals(-7, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateAndBrakeCorrectlyForTandemBike() {
        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(5, bicycle.currentSpeed());

    }


    @Test
    public void shouldBeAbleToStopForTandemBike() {
        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }

}