/**
 * Created by eliyahudorsky on 1/23/16. BS"D
 */
public class Car extends Vehicle {

    private int rpm;
    private int numberWheels;

    public Car(String name, int speed, int size, int capacity, int rpm, int numberWheels) {
        super(name, speed, size, capacity);
        this.rpm = rpm;
        this.numberWheels = numberWheels;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public int getRpm() {
        return rpm;
    }

    @Override
    public void move(int rpm) {
        super.move(getSpeed());
        System.out.println("Car.move called, the car's rpm is " + rpm);

    }
}

