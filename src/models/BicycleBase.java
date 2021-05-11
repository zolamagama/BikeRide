package models;


import bicycles.Bicycle;

public abstract class BicycleBase implements Bicycle {
    private int speed;

    protected void changeSpeed(int diff) {

        speed = speed + diff;

    }

    @Override
    public int currentSpeed() {
        return speed;

    }

    @Override
    public int stop() {
        return speed = 0;

    }
}
