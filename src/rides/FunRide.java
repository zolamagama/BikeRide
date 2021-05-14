package rides;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private List<Bicycle> bicycleList = new ArrayList<>();
    private int maximumBikes;
    private int bikeCounter;

    public FunRide(int max) {
        this.maximumBikes = max;
    }

    public void accept(Bicycle bicycle) {
        if (bikeCounter < maximumBikes) {
            bicycleList.add(bicycle);
            bikeCounter++;
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
