//package bicycles;
//
//import models.*;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class BikeRideTest {
//
//    @Test
//    public void shouldBeAbleToAccelerateAndBrakeSimultaneouslyForRoadBike
//            () {
//
//        RoadBike type = new RoadBike();
//        BikeRide bikeRide = new BikeRide(type);
//        bikeRide.ride();
//
//        assertEquals(36, bikeRide.currentSpeed());
//    }
//
//   @Test
//    public void shouldBeAbleToAccelerateAndBrakeSimultaneouslyForMountainBike
//            () {
////        Bicycles bicycle = new ();
//        MountainBike type = new MountainBike();
//        BikeRide bikeRide = new BikeRide(type);
//        bikeRide.ride();
//
//        assertEquals(14, bikeRide.currentSpeed());
//    }
//
//    @Test
//    public void shouldBeAbleToAccelerateAndBrakeSimultaneouslyForTandemBike
//            () {
////        Bicycles bicycle = new ();
//        Tandem type = new Tandem();
//        BikeRide bikeRide = new BikeRide(type);
//        bikeRide.ride();
//
//        assertEquals(34, bikeRide.currentSpeed());
//    }
//
//    @Test
//    public void shouldBeAbleToStopForRoadBike() {
//        RoadBike type = new RoadBike();
//        BikeRide bikeRide = new BikeRide(type);
//        bikeRide.ride();
//
//
//        assertEquals(0, bikeRide.stop());
//
//    }
//
//    @Test
//    public void shouldBeAbleToStopForMountainBike() {
//        MountainBike type = new MountainBike();
//        BikeRide bikeRide = new BikeRide(type);
//        bikeRide.ride();
//
//        assertEquals(0 , bikeRide.stop());
//    }
//
//    @Test
//    public void shouldBeAbleToStopForTandemBike() {
//        Tandem type = new Tandem();
//        BikeRide bikeRide = new BikeRide(type);
//        bikeRide.ride();
//
//        assertEquals(0 , bikeRide.stop());
//    }
//}
