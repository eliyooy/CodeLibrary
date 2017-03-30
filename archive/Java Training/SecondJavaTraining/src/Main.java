/**
 * Created by eliyahudorsky on 1/20/16. BS"D
 */
public class Main {
    public static void main(String[] args) {
        VipCustomer Arnold = new VipCustomer("Arnold Aronson", 2000, "arnold@aronson.com");

        System.out.println("Welcome to Savings Union " + Arnold.getName() + "!" + " Your credit" +
                "limit is currently " + Arnold.getLimit() + "." + "Your email: " + Arnold.getEmail());
    }
}
