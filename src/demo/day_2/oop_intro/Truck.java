package demo.day_2.oop_intro;

// POJO
public class Truck extends Vehicle{

    // instance variables - each object get's their own copy of these variables
    int bedLength;
    boolean hasCamperShell;

    public Truck() {
    }

    public Truck(int numDoors, int horsePower, int currentSpeed, int bedLength,
                 boolean hasCamperShell) {
        super.numDoors = numDoors;
        super.horsePower = horsePower;
        super.currentSpeed = currentSpeed;
        this.bedLength = bedLength;
        this.hasCamperShell = hasCamperShell;
    }

    public boolean isHasCamperShell() {
        return hasCamperShell;
    }

    public void setHasCamperShell(boolean hasCamperShell) {
        this.hasCamperShell = hasCamperShell;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "bedLength=" + bedLength +
                ", hasCamperShell=" + hasCamperShell +
                ", numDoors=" + numDoors +
                ", horsePower=" + horsePower +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

    @Override
    public void accelerate() {
        System.out.println("truck accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("truck decelerating");
    }
}
