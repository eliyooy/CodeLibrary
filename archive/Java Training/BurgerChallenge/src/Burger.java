/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class Burger {
    private String meat;
    private String roll;
    private double price;

    public Burger(String meat, String roll, double price) {
        if((this.meat == "rare") || this.meat == "medium" || this.meat == "well done"){
            this.meat = meat;
        } else {
            this.meat = "Invalid entry";
        }
        if((this.roll == "white") || this.roll == "brown rye" || this.roll == "whole wheat") {
            this.roll = roll;
        } else {
            this.roll = "Invalid entry";
        }
        this.price = price;
    }

    public void addLettuce() {
        this.price = this.price + 0.50d;
        System.out.println("Lettuce added. $0.50 added. New total: " + this.price);
    }

    public void addTomato() {
        this.price = this.price + 0.75d;
        System.out.println("Tomato added.  $0.75 added. New total: " + this.price);
    }

    public void addOnion() {
        this.price = this.price + 0.65d;
        System.out.println("Onion added.  $0.65 added. New total: " + this.price);
    }

    public void addPickles() {
        this.price = this.price + 0.25d;
        System.out.println("Pickles added. $0.25 added.  New total: " + this.price);
    }

    public String getMeat() {
        return meat;
    }

    public String getRoll() {
        return roll;
    }

    public double getPrice() {
        return price;
    }
}
