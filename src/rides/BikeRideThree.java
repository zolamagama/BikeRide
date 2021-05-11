package rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideThree implements BikeRide {

    private Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();

    }
}
