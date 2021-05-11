package models;

import bicycles.Bicycle;


public class MountainBike extends BicycleBase {
//    private int speed = 0;

    @Override
    public void accelerate() {
        changeSpeed(+5);
//        speed += 5;
//        System.out.println("Speed: " + speed);
    }

    @Override
    public void brake() {

        changeSpeed(-3);
//        speed -= 3;
//        System.out.println("Braking: " + speed);
    }

//    @Override
//    public int currentSpeed() {
//        return speed;
//    }
//
//    @Override
//    public int stop() {
//        return 0;
//    }

}
//
//
//
//
//
//
//
//
//
//
//
//
//
//        //    private int speed = 0;
//        //
//        //    public void accelerate() {
//        //        speed += 5;
//        //        System.out.println("Speed: " + speed);
//        ////       return speed;
//        //        //       System.out.println("Acceleration: ");
//        //    }
//        //    public void brake() {
//        //        speed -= 3;
//        //        System.out.println("Braking: " + speed);
//        ////        System.out.println("Braking: ");
//        //    }
//        //    public void currentSpeed() {
//        ////        speed = speed;
//        ////        return speed;
//        //
//        //        System.out.println("Current speed: " + speed);
//        //
//        //    }
//        //
//        //    @Override
//        //    public void stop() {
//        //
//        //    }
//
//
//}
//
////public class MountainBike {
////    private int speed = 0;
////
////    public int accelerate() {
////        speed += 5;
////        System.out.println("Speed: " + speed);
////        return speed;
////    }
////
////    public int brake() {
////        speed -= 3;
////        System.out.println("Braking: " + speed);
////
////        return speed ;
////    }
////    public int currentSpeed () {
////           System.out.println("Current speed: " + speed);
////        return speed;
////    }
////
////    public int stop () {
////        speed -= speed;
////            System.out.println("Stopped: " + speed);
////        return speed;
////    }
////    public static void main(String[] args) {
////        MountainBike bicycles = new MountainBike();
////        bicycles.accelerate();
////        bicycles.brake();
//////        bicycles.brake();
////        bicycles.currentSpeed();
////        bicycles.stop();
////    }
////}
//
//
