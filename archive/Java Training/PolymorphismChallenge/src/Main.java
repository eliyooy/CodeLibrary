/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders, int wheels, boolean engine) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Generic engine has started.";
    }

    public String accelerate() {
        return "Generic car is accelerating.";
    }

    public String brake() {
        return "Generic car is braking.";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}

class Toyota extends Car {
    public Toyota() {
        super("Toyota", 8, 4, true);
    }

    public String startEngine() {
        return "Toyota MC-500 engine started.";
    }

    public String brake() {
        return "Toyota ultra-lock brakes activated.";
    }
}

class Dodge extends Car {
    public Dodge() {
        super("Dodge", 6, 4, true);
    }

    public String brake() {
        return "Dodge weather-resistant brakes activated.";
    }

    public String accelerate() {
        return "Dodge is accelerating.";
    }
}

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            Car car = randomCar();
            System.out.println("Car Name: " + car.getName() + "\n" + "Car cylinders: " + car.getCylinders() +
                    "\n" + car.getWheels() + " wheels" + "\n" + car.startEngine() + "\n" + car.brake() +
                    "\n" + car.accelerate());
        }
    }

        public static Car randomCar() {
            int randomNumber = (int) ((Math.random() * 2) + 1);
            switch(randomNumber) {
                case 1:
                    return new Toyota();

                case 2:
                    return new Dodge();
            }
        return null;
        }
    }

