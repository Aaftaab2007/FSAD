class Engine {
    private String type;
    public Engine(String type) {
        this.type = type;
        System.out.println("Engine created: " + type);
    }
    public void start() {
        System.out.println("Engine started (" + type + ")");
    }
}
class Car {
    private Engine engine;
    public Car(String engineType) {
        engine = new Engine(engineType);
        System.out.println("Car is created with its engine.");
    }
    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
public class EndLab {
    public static void main(String[] args) {
        Car car = new Car("V8 Turbo");
        car.drive();
        car = null;
        System.gc();
        try { Thread.sleep(1000); }
        catch (InterruptedException e) {}
    }
}