/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class HealthyBurger extends Burger {
    public HealthyBurger(String meat, String roll, double price) {
        super(meat, "brown rye", 7.50d);
    }

    public int HealthyAdditions = 0;

    @Override
    public void addLettuce() {
        HealthyAdditions++;
        if(HealthyAdditions > 2) {
            System.out.println("Maximum additions reached.");
        } else {
            super.addLettuce();
        }
    }

    @Override
    public void addTomato() {
        HealthyAdditions++;
        if(HealthyAdditions > 2) {
            System.out.println("Maximum additions reached.");
        } else {
            super.addTomato();
        }
    }

    @Override
    public void addOnion() {
        HealthyAdditions++;
        if(HealthyAdditions > 2) {
            System.out.println("Maximum additions reached.");
        } else {
            super.addOnion();
        }
    }

    @Override
    public void addPickles() {
        HealthyAdditions++;
        if(HealthyAdditions > 2) {
            System.out.println("Maximum additions reached.");
        } else {
            super.addPickles();
        }
    }
}
