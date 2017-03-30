/**
 * Created by eliyahudorsky on 1/20/16. BS"D
 */
public class Main5 {
    // Constructors and Constructor Overloading

    private String number;
    private double balance;
    private String email;

    public Main5("1234", 0.00, "bob@bob.com") {
        System.out.println("Empty constructor called"); /* <--- Empty constructor, executed automatically */
    }

    public Main5() {
        this("1234", 0.00, "bob@bob.com");
    }

    public Main5(String number, double balance, String email) { /*Shortcut from setting */
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.email = email;
    }

    Main5 bobsAccount = new Main5();


}
