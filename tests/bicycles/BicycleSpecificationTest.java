package bicycles;


import org.junit.jupiter.api.Test;
import rides.BikeRideOne;
import rides.BikeRideThree;
import rides.BikeRideTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {

    @Test

    public void shouldBeAbleToExecuteBikeRideOneForRoadBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRide = new BikeRideOne(roadBike);
        bikeRide.ride(roadBike);

        assertEquals(36, roadBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideTwoForRoadBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(roadBike);

        bikeRideTwo.ride(roadBike);


        assertEquals(0, roadBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideThreeForRoadBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        BikeRideThree bicycle = new BikeRideThree(roadBike);
        bicycle.ride(roadBike);

        assertEquals(42, roadBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideOneForMountainBike () {
    BicycleSpecification bicycleSpecification = new BicycleSpecification(5, 3, BicycleType.MountainBike);
    Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
    BikeRideOne bicycle = new BikeRideOne(mountainBike);
    bicycle.ride(mountainBike);

        assertEquals(14, mountainBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideTwoForMountainBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        BikeRideTwo bicycle = new BikeRideTwo(mountainBike);
        bicycle.ride(mountainBike);

        assertEquals(0, mountainBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideThreeForMountainBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        BikeRideThree bicycle = new BikeRideThree(mountainBike);
        bicycle.ride(mountainBike);

        assertEquals(12, mountainBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideOneForTandemBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);
        BikeRideOne bicycle = new BikeRideOne(tandem);
        bicycle.ride(tandem);

        assertEquals(34, tandem.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideTwoForTandemBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);
        BikeRideTwo bicycle = new BikeRideTwo(tandem);
        bicycle.ride(tandem);

        assertEquals(0, tandem.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideThreeForTandemBike () {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);
        BikeRideThree bicycle = new BikeRideThree(tandem);
        bicycle.ride(tandem);

        assertEquals(30, tandem.currentSpeed());

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
