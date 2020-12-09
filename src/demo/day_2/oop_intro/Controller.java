package demo.day_2.oop_intro;

public class Controller {
    public static void main(String[] args) {

        Truck t1 = new Truck();
        t1.horsePower = 300;
        t1.bedLength = 50;
        t1.currentSpeed = 0;
        t1.hasCamperShell = true;
        t1.numDoors = 2;

        Truck t2 = new Truck(4, 500, 25,
                75, false);

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        System.out.println("My truck has " + t1.numDoors + " doors.");
        System.out.println("Your truck has " + t2.numDoors + " doors.");

        t1.start();
        t1.accelerate();
        t1.decelerate();
        t1.stop();

        t2.start();

        System.out.println("T/F your truck has a camper shell? "
                + t2.isHasCamperShell());

        t2.setHasCamperShell(true);

        System.out.println("T/F your truck has a camper shell? "
                + t2.isHasCamperShell());

        Sedan s1 = new Sedan();
        s1.trunkSize = 35;
        s1.numDoors = 4;
        s1.horsePower = 150;
        s1.currentSpeed = 70;
        System.out.println(s1.toString());
        s1.accelerate();

        Motorcycle m1 = new Motorcycle();
        m1.numDoors = 0;
        m1.cc = 1000;
        m1.currentSpeed = 45;
        m1.accelerate();

        System.out.println(4);
        System.out.println("4");
        System.out.println(3.14);
        System.out.println(m1);
        System.out.println('z');

        // override & overload
    }
}
