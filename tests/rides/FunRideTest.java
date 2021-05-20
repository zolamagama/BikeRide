package rides;


import bicycles.Bicycle;
import bicycles.BicycleFromSpec;
import bicycles.BicycleSpecification;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class FunRideTest {

    @Test

    public void shouldBeAbleToCountForRoadBike() {

        FunRide funRide = new FunRide(6);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle roadBike1 = new BicycleFromSpec(bicycleSpecification);
        Bicycle roadBike2 = new BicycleFromSpec(bicycleSpecification);

        funRide.accept(roadBike);
        funRide.accept(roadBike1);
        funRide.accept(roadBike2);


        assertEquals(3, funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test

    public void shouldNotAbleToGoOverTheMaxForRoadBike() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle roadBike1 = new BicycleFromSpec(bicycleSpecification);
        Bicycle roadBike2 = new BicycleFromSpec(bicycleSpecification);
        Bicycle blueRoadBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle redRoadBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle purpleRoadBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle roadBike3 = new BicycleFromSpec(bicycleSpecification);

        funRide.accept(roadBike);
        funRide.accept(roadBike1);
        funRide.accept(roadBike2);
        funRide.accept(blueRoadBike);
        funRide.accept(redRoadBike);
        funRide.accept(purpleRoadBike);
        funRide.accept(roadBike3);

        assertEquals(5, funRide.getCountForType(BicycleType.RoadBike));

    }


    @Test

    public void shouldBeAbleToCountForMountainBike() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5,3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle mountainBike1 = new BicycleFromSpec(bicycleSpecification);
        Bicycle mountainBike2 = new BicycleFromSpec(bicycleSpecification);

        funRide.accept(mountainBike);
        funRide.accept(mountainBike1);
        funRide.accept(mountainBike2);



        assertEquals(3, funRide.getCountForType(BicycleType.MountainBike));
    }
    @Test

    public void shouldNotAbleToGoOverTheMaxForMountainBike() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5,3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle mountainBike1 = new BicycleFromSpec(bicycleSpecification);
        Bicycle mountainBike2 = new BicycleFromSpec(bicycleSpecification);
        Bicycle mountainBike3 = new BicycleFromSpec(bicycleSpecification);
        Bicycle blueMountainBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle redMountainBike = new BicycleFromSpec(bicycleSpecification);

        funRide.accept(mountainBike);
        funRide.accept(mountainBike1);
        funRide.accept(mountainBike2);
        funRide.accept(mountainBike3);
        funRide.accept(blueMountainBike);
        funRide.accept(redMountainBike);



        assertEquals(5, funRide.getCountForType(BicycleType.MountainBike));

    }

    @Test

    public void shouldBeAbleToCountForTandemBike() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12,7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle tandemBike1 = new BicycleFromSpec(bicycleSpecification);
        Bicycle tandemBike2 = new BicycleFromSpec(bicycleSpecification);

        funRide.accept(tandemBike);
        funRide.accept(tandemBike1);
        funRide.accept(tandemBike2);



        assertEquals(3, funRide.getCountForType(BicycleType.Tandem));
    }

    @Test

    public void shouldNotAbleToGoOverTheMaxForTandemBike() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12,7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle tandemBike1 = new BicycleFromSpec(bicycleSpecification);
        Bicycle tandemBike2 = new BicycleFromSpec(bicycleSpecification);
        Bicycle tandemBike3 = new BicycleFromSpec(bicycleSpecification);
        Bicycle blueTandemBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle redTandemBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle purpleTandemBike = new BicycleFromSpec(bicycleSpecification);

        funRide.accept(tandemBike);
        funRide.accept(tandemBike1);
        funRide.accept(tandemBike2);
        funRide.accept(tandemBike3);
        funRide.accept(redTandemBike);
        funRide.accept(blueTandemBike);
        funRide.accept(purpleTandemBike);


        assertEquals(5, funRide.getCountForType(BicycleType.Tandem));

    }

    @Test

    public void shouldBeAbleToCountAllBikes() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12,7, BicycleType.Tandem);
        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(5,3, BicycleType.MountainBike);
        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(11,4, BicycleType.RoadBike);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification1);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification2);

        funRide.accept(tandemBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);


        assertEquals(3, funRide.getEnteredCount());
    }

    @Test
    
    public void shouldNotBeAbleToGetCountOverTheMaxForAllBikes() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12,7, BicycleType.Tandem);
        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(5,3, BicycleType.MountainBike);
        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(11,4, BicycleType.RoadBike);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification1);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification2);
        Bicycle tandemBike1 = new BicycleFromSpec(bicycleSpecification);
        Bicycle roadBike1 = new BicycleFromSpec(bicycleSpecification1);
        Bicycle mountainBike1 = new BicycleFromSpec(bicycleSpecification2);


        funRide.accept(tandemBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike1);
        funRide.accept(tandemBike1);
        funRide.accept(roadBike1);


        assertEquals(5, funRide.getEnteredCount());

    }

    @Test

    public void shouldNotAcceptDuplicatesForAllBikes() {
        FunRide funRide = new FunRide(5);
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12,7, BicycleType.Tandem);
        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(5,3, BicycleType.MountainBike);
        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(11,4, BicycleType.RoadBike);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification1);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification2);

        funRide.accept(tandemBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(tandemBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);

        assertEquals(3, funRide.getEnteredCount());
    }



}
