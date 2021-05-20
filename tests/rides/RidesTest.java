package rides;


import specification.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RidesTest {

    @Test

    public void shouldBeAbleToExecuteBikeRideOneForRoadBike () {
        RoadBike roadBike = new RoadBike();
        BikeRideOne bicycle = new BikeRideOne(roadBike);
        bicycle.ride(roadBike);

        assertEquals(36, roadBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideTwoForRoadBike () {
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bicycle = new BikeRideTwo(roadBike);
        bicycle.ride(roadBike);

        assertEquals(0, roadBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideThreeForRoadBike () {
        RoadBike roadBike = new RoadBike();
        BikeRideThree bicycle = new BikeRideThree(roadBike);
        bicycle.ride(roadBike);

        assertEquals(42, roadBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideOneForMountainBike () {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bicycle = new BikeRideOne(mountainBike);
        bicycle.ride(mountainBike);

        assertEquals(14, mountainBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideTwoForMountainBike () {
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bicycle = new BikeRideTwo(mountainBike);
        bicycle.ride(mountainBike);

        assertEquals(0, mountainBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideThreeForMountainBike () {
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bicycle = new BikeRideThree(mountainBike);
        bicycle.ride(mountainBike);

        assertEquals(12, mountainBike.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideOneForTandemBike () {
        Tandem tandem = new Tandem();
        BikeRideOne bicycle = new BikeRideOne(tandem);
        bicycle.ride(tandem);

        assertEquals(34, tandem.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideTwoForTandemBike () {
        Tandem tandem = new Tandem();
        BikeRideTwo bicycle = new BikeRideTwo(tandem);
        bicycle.ride(tandem);

        assertEquals(0, tandem.currentSpeed());

    }

    @Test

    public void shouldBeAbleToExecuteBikeRideThreeForTandemBike () {
        Tandem tandem = new Tandem();
        BikeRideThree bicycle = new BikeRideThree(tandem);
        bicycle.ride(tandem);

        assertEquals(30, tandem.currentSpeed());

    }


}
