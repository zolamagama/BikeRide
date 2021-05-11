package bicycles;

import models.BicycleBase;

public class BicycleFromSpec extends BicycleBase {

    BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycle) {
    this.bicycleSpecification = bicycle;
    }

    @Override
    public void accelerate() {
    this.changeSpeed(this.bicycleSpecification.getAccelerationSpeed());
    }

    @Override
    public void brake() {
    this.changeSpeed(this.bicycleSpecification.getBrakeSpeedSpeed());
    }

    public BicycleType getBicycleType() {
        return this.bicycleSpecification.getBicycleType();
    }
}
