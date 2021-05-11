package models;

public class RoadBike extends BicycleBase {
//    private int speed = 0;
    @Override
    public void accelerate() {

        changeSpeed(+11);
//        System.out.println("Speed: " + speed);
    }

    @Override
    public void brake() {
//        speed -= 4;
        changeSpeed(-4);
//        System.out.println("Braking: " + speed);
    }

/*
    @Override
    public int currentSpeed() {
    return speed;
    }

    @Override
    public int stop() {
        return 0;

    }
        public static void main(String[] args) {
        RoadBike bicycles = new RoadBike();
        bicycles.accelerate();
        bicycles.accelerate();
        bicycles.brake();
        bicycles.brake();
        bicycles.currentSpeed();
        bicycles.stop();
    }
    public void accelerate() {
//        System.out.println("Acceleration: ");
    }
    public void brake() {
        //       System.out.println("Braking: ");
    }
    public void currentSpeed() {
        //      System.out.println("Current speed: ");

    }
    public void stop() {
        //       System.out.println("Stopped: ");

    }
*/

}
//
////public class RoadBike {
////
////    private int speed = 0;
////
////    public int accelerate() {
////        speed += 11;
////            System.out.println("Speed: " + speed);
////
////        return speed;
////    }
////
////    public int brake() {
////        speed -= 4;
////        System.out.println("Braking: " + speed);
////        return speed ;
////    }
////    public int currentSpeed () {
////        System.out.println("Current speed: " + speed);
////        return speed;
////    }
////
////    public int stop () {
////        speed -= speed;
////           System.out.println("Stopped: " + speed);
////        return speed;
////    }
////    public static void main(String[] args) {
////        RoadBike bicycles = new RoadBike();
////        bicycles.accelerate();
////        bicycles.accelerate();
////        bicycles.brake();
//////        bicycles.brake();
////       bicycles.currentSpeed();
////        bicycles.stop();
////    }
////
////
////}
//
//
