package bicycles;

import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import models.Tandem;
import org.junit.jupiter.api.Test;
import rides.FunRide;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class FunRideTest {

    @Test

    public void shouldBeAbleToCountForRoadBike() {
        FunRide funRide = new FunRide(6);
        RoadBike roadBike = new RoadBike();
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);


        assertEquals(5, funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test

    public void shouldNotAbleToGoOverTheMaxForRoadBike() {
        FunRide funRide = new FunRide(6);
        Tandem roadBike = new Tandem();
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);

        assertEquals(6, funRide.getCountForType(BicycleType.RoadBike));

    }

    @Test

    public void shouldBeAbleToCountForMountainBike() {
        FunRide funRide = new FunRide(10);
        MountainBike mountainBike = new MountainBike();
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);



        assertEquals(3, funRide.getCountForType(BicycleType.MountainBike));
    }
    @Test

    public void shouldNotAbleToGoOverTheMaxForMountainBike() {
        FunRide funRide = new FunRide(10);
        MountainBike mountainBike = new MountainBike();
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);

        assertEquals(10, funRide.getCountForType(BicycleType.MountainBike));

    }

    @Test

    public void shouldBeAbleToCountForTandemBike() {
        FunRide funRide = new FunRide(8);
        Tandem tandemBike = new Tandem();
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);



        assertEquals(3, funRide.getCountForType(BicycleType.Tandem));
    }

    @Test

    public void shouldNotAbleToGoOverTheMaxForTandemBike() {
        FunRide funRide = new FunRide(8);
        Tandem tandemBike = new Tandem();
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);


        assertEquals(8, funRide.getCountForType(BicycleType.Tandem));

    }

    @Test

    public void shouldBeAbleToCountAllBikes() {
        FunRide funRide = new FunRide(8);
        RoadBike roadBike = new RoadBike();
        MountainBike mountainBike = new MountainBike();
        Tandem tandemBike = new Tandem();

        funRide.accept(tandemBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(tandemBike);

        assertEquals(5, funRide.getEnteredCount());
    }

    @Test
    
    public void shouldNotBeAbleToGetCountOverTheMaxForAllBikes() {
        FunRide funRide = new FunRide(8);
        RoadBike roadBike = new RoadBike();
        MountainBike mountainBike = new MountainBike();
        Tandem tandemBike = new Tandem();

        funRide.accept(tandemBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(tandemBike);
        funRide.accept(tandemBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(tandemBike);

        assertEquals(8, funRide.getEnteredCount());

    }



}
