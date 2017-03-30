/**
 * Created by eliyahudorsky on 1/20/16. BS"D
 */
public class VipCustomer {
    private String name;
    private int limit;
    private String email;

    public VipCustomer() {
        this("No name provided", 0, "No email provided");
    }

    public VipCustomer(String name, int limit) {
        this(name, limit, "No email provided");
    }

    public VipCustomer(String name, int limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
