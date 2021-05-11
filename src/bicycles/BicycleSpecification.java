package bicycles;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed =- brakeSpeed;
        this.bicycleType = bicycleType;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    public int getBrakeSpeedSpeed(){
        return brakeSpeed;
    }

    public BicycleType getBicycleType(){
        return bicycleType;
    }
}
