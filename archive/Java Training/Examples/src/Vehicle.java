/**
 * Created by eliyahudorsky on 1/23/16. BS"D
 */
public class Vehicle {

    private String name;
    private int speed;
    private int size;
    private int capacity;

    public Vehicle(String name, int speed, int size, int capacity) {
        this.name = name;
        this.speed = speed;
        this.size = size;
        this.capacity = capacity;
    }

    public void move(int vehicleSpeed) {
        speed = vehicleSpeed;
        System.out.println("Super.move called, the vehicle's speed is " + speed);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
