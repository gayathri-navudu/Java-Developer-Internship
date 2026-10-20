package corejava;
abstract class Vehicle {
    abstract void start();
    void stop() {
        System.out.println("Vehicle stopped");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
    }
}
