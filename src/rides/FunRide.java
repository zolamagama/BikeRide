package rides;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private List<Bicycle> bicycleList = new ArrayList<>();
    private int maximumBikes;


    public FunRide(int max) {
        this.maximumBikes = max;
    }

    public void accept(Bicycle bicycle) {
        if (bicycleList.size() < maximumBikes && !bicycleList.contains(bicycle)) {
            bicycleList.add(bicycle);

        }

    }

    public int getCountForType(BicycleType bicycleType) {
        int bikeCount = 0;
        for (Bicycle bikes : bicycleList) {
            if (bikes.getBicycleType() == bicycleType) {
                bikeCount++;
            }

        }
        return bikeCount;

    }
    public int getEnteredCount() {
        return bicycleList.size();
    }
}
