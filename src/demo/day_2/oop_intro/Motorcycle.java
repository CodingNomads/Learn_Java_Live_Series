package demo.day_2.oop_intro;

public class Motorcycle extends Vehicle{

    int cc;

    @Override
    public void accelerate() {
        System.out.println("motorcycle spinning throttle");
    }

    @Override
    public void decelerate() {
        System.out.println("motorcycle slowing down");
    }
}
