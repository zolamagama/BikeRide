package bicycles;

import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.jupiter.api.Test;
import rides.FunRide;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class FunRideTest {

    @Test

    public void shouldBeAbleToCountForRoadBike() {
        FunRide funRide = new FunRide(6);
        RoadBike roadBike = new RoadBike();
        RoadBike roadBike1 = new RoadBike();
        RoadBike roadBike2 = new RoadBike();
        funRide.accept(roadBike);
        funRide.accept(roadBike1);
        funRide.accept(roadBike2);
        //roadBike1 is already in the list therefore wont be counted
        funRide.accept(roadBike);
        funRide.accept(roadBike);


        assertEquals(3, funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test

    public void shouldNotAbleToGoOverTheMaxForRoadBike() {
        FunRide funRide = new FunRide(5);
        RoadBike roadBike = new RoadBike();
        RoadBike roadBike1 = new RoadBike();
        RoadBike roadBike2 = new RoadBike();
        RoadBike roadBike3 = new RoadBike();
        RoadBike blueRoadBike = new RoadBike();
        RoadBike redRoadBike = new RoadBike();
        RoadBike purpleRoadBike = new RoadBike();

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
        MountainBike mountainBike = new MountainBike();
        MountainBike mountainBike1 = new MountainBike();
        MountainBike mountainBike2 = new MountainBike();

        funRide.accept(mountainBike);
        funRide.accept(mountainBike1);
        funRide.accept(mountainBike2);



        assertEquals(3, funRide.getCountForType(BicycleType.MountainBike));
    }
    @Test

    public void shouldNotAbleToGoOverTheMaxForMountainBike() {
        FunRide funRide = new FunRide(5);
        MountainBike mountainBike = new MountainBike();
        MountainBike mountainBike1 = new MountainBike();
        MountainBike mountainBike2 = new MountainBike();
        MountainBike mountainBike3 = new MountainBike();
        MountainBike blueMountainBike = new MountainBike();
        MountainBike redMountainBike = new MountainBike();

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
        Tandem tandemBike = new Tandem();
        Tandem tandemBike1 = new Tandem();
        Tandem tandemBike2 = new Tandem();

        funRide.accept(tandemBike);
        funRide.accept(tandemBike1);
        funRide.accept(tandemBike2);



        assertEquals(3, funRide.getCountForType(BicycleType.Tandem));
    }

    @Test

    public void shouldNotAbleToGoOverTheMaxForTandemBike() {
        FunRide funRide = new FunRide(5);
        Tandem tandemBike = new Tandem();
        Tandem tandemBike1 = new Tandem();
        Tandem tandemBike2 = new Tandem();
        Tandem tandemBike3 = new Tandem();
        Tandem blueTandemBike = new Tandem();
        Tandem redTandemBike = new Tandem();
        Tandem purpleTandemBike = new Tandem();

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
        RoadBike roadBike = new RoadBike();
        MountainBike mountainBike = new MountainBike();
        Tandem tandemBike = new Tandem();

        funRide.accept(tandemBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);


        assertEquals(3, funRide.getEnteredCount());
    }

    @Test
    
    public void shouldNotBeAbleToGetCountOverTheMaxForAllBikes() {
        FunRide funRide = new FunRide(5);
        RoadBike roadBike = new RoadBike();
        RoadBike roadBike1 = new RoadBike();
        MountainBike mountainBike = new MountainBike();
        MountainBike mountainBike1 = new MountainBike();
        Tandem tandemBike = new Tandem();
        Tandem tandemBike1 = new Tandem();


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
        RoadBike roadBike = new RoadBike();
        MountainBike mountainBike = new MountainBike();
        Tandem tandemBike = new Tandem();

        funRide.accept(tandemBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(tandemBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);

        assertEquals(3, funRide.getEnteredCount());
    }



}
