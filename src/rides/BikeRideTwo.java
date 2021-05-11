package rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideTwo implements BikeRide {
    private Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle) {
        this.bicycle = bicycle;
    }
    @Override
    public void ride(Bicycle bicycle) {
    bicycle.accelerate();
    bicycle.accelerate();
    bicycle.accelerate();
    bicycle.stop();
    }
}
