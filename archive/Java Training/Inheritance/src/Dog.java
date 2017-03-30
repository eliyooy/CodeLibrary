/**
 * Created by eliyahudorsky on 1/23/16. BS"D
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew called");
    }

    public void walk() {
        System.out.println("Dog.walk called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run called");
        move(10);
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat(); /* super restricts calling to the super-class even with overriding */

    }


}
