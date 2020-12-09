package demo.day_2.oop_intro;

public class Sedan extends Vehicle {

    int trunkSize;

//    public void start(){
//        System.out.println("starting Sedan");
//    }
//
//    public void stop(){
//        System.out.println("stopping Sedan");
//    }
//
//    public void accelerate(){
//        System.out.println("accelerating Sedan");
//    }
//
//    public void decelerate(){
//        System.out.println("decelerating Sedan");
//    }


    @Override
    public String toString() {
        return "Sedan{" +
                "trunkSize=" + trunkSize +
                ", numDoors=" + numDoors +
                ", horsePower=" + horsePower +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

    @Override
    public void accelerate() {
        System.out.println("sedan accelerating`");
    }

    @Override
    public void decelerate() {
        System.out.println("sedan decelerate`");
    }
}
