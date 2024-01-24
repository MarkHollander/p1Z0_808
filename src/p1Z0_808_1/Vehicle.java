package p1Z0_808_1;

public class Vehicle {
    int x;

    Vehicle() {
        this(10); // line n1
        System.out.println("Calling Vehicle's constructor");
    }

    Vehicle(int x) {
        this.x = x;
    }
}
