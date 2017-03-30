/**
 * Created by eliyahudorsky on 1/23/16. BS"D
 */
public class Toyota extends Car {

    private int handSteering;
    private int changeGears;

    public Toyota(String name, int speed, int size, int capacity, int rpm, int numberWheels, int handSteering, int changeGears) {
        super(name, speed, size, capacity, rpm, numberWheels);
        this.handSteering = handSteering;
        this.changeGears = changeGears;
    }

    public void operate() {
        move(100);
        System.out.println("Toyota.operate called");
    }

}
