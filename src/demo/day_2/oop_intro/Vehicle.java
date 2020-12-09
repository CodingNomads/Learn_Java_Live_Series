package demo.day_2.oop_intro;

    public abstract class Vehicle implements VehicleInterface {

    // instance variables - each object get's their own copy of these variables
    int numDoors;
    int horsePower;
    int currentSpeed;

    public void start(){
        System.out.println("starting Vehicle");
    }

    public void stop(){
        System.out.println("stopping Vehicle");
    }

}
