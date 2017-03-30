/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class Main {
    public static void main(String[] args) {
        DeluxeBurger order1 = new DeluxeBurger("rare", "white", 5.50d);
        order1.addLettuce();
        order1.addTomato();
        System.out.println("Total for Order 1: " + order1.getPrice());

        HealthyBurger order2 = new HealthyBurger("medium", "brown rye", 7.50d);
        order2.addOnion();
        order2.addPickles();
        order2.addTomato();
        System.out.println("Total for Order 2: " + order2.getPrice());

        RegularBurger order3 = new RegularBurger("well done", "white", 100.0d);
        order3.addTomato();
        System.out.println("Total for Order 3: " + order3.getPrice());

        DeluxeBurger order4 = new DeluxeBurger("super well done", "whole wheat", 200.00d);
        System.out.println("Total for Order 4: " + order4.getPrice());

    }
}
