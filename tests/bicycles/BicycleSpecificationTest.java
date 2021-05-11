package bicycles;

import models.RoadBike;
import org.junit.jupiter.api.Test;
import rides.BikeRideOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {

    @Test

    public void shouldAccelerateForRoadBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        roadBike.accelerate();
        roadBike.accelerate();

        assertEquals(22, roadBike.currentSpeed());

    }

    @Test

    public void shouldBrakeForRoadBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        roadBike.accelerate();
        roadBike.brake();
        roadBike.brake();


        assertEquals(3, roadBike.currentSpeed());

    }
    @Test

    public void shouldBeAbleToStopForRoadBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.brake();
        roadBike.stop();

        assertEquals(0, roadBike.currentSpeed());
    }

    @Test

    public void shouldAccelerateForMountainBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        mountainBike.accelerate();
        mountainBike.accelerate();


        assertEquals(10, mountainBike.currentSpeed());

    }

    @Test

    public void shouldBrakeForMountainBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountain = new BicycleFromSpec(bicycleSpecification);
        mountain.accelerate();
        mountain.accelerate();
        mountain.brake();
        mountain.brake();


        assertEquals(4, mountain.currentSpeed());

    }

    @Test

    public void shouldBeAbleToStopForMountainBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.stop();

        assertEquals(0, mountainBike.currentSpeed());
    }

    @Test

    public void shouldAccelerateForTandemBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        tandemBike.accelerate();
        tandemBike.accelerate();


        assertEquals(24, tandemBike.currentSpeed());

    }
    @Test

    public void shouldBrakeForTandemBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        tandemBike.accelerate();
        tandemBike.accelerate();
        tandemBike.brake();
        tandemBike.brake();


        assertEquals(10, tandemBike.currentSpeed());

    }

    @Test

    public void shouldStopForTandemBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        tandemBike.accelerate();
        tandemBike.accelerate();
        tandemBike.brake();
        tandemBike.brake();
        tandemBike.stop();


        assertEquals(0, tandemBike.currentSpeed());

    }

    @Test

    public void shouldNotBrakeBeyondZeroForAllBikes () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7, BicycleType.Tandem);
        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification1);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification2);

        tandemBike.accelerate();
        tandemBike.brake();
        tandemBike.brake();

        assertEquals(0, tandemBike.currentSpeed());

        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.brake();

        assertEquals(0, mountainBike.currentSpeed());

        roadBike.accelerate();
        roadBike.brake();
        roadBike.brake();
        roadBike.brake();

        assertEquals(0, roadBike.currentSpeed());

    }


    
}
