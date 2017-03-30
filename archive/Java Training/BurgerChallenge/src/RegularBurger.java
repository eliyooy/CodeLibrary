/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class RegularBurger extends Burger {
    public RegularBurger(String meat, String roll, double price) {
        super(meat, roll, 5.50d);
        addChips();
        addSoda();
    }

    public void addChips() {
        System.out.println("Chips added.");
    }

    public void addSoda() {
        System.out.println("Soda added.");
    }

    @Override
    public void addLettuce() {
        System.out.println("Addition void.");
    }

    @Override
    public void addTomato() {
        System.out.println("Addition void.");
    }

    @Override
    public void addOnion() {
        System.out.println("Addition void.");
    }

    @Override
    public void addPickles() {
        System.out.println("Addition void.");
    }


}
