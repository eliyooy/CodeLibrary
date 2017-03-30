import java.util.ArrayList;

/**
 * Created by eliyahudorsky on 1/28/16. BS"D
 */
public class Branch {

    String branchName;
    String customerName;
    ArrayList<String> customerNames = new ArrayList<>();
    ArrayList<Double> customerTransactions = new ArrayList<>();

    public void addName(int position, String customerName, int transaction, double amount) {
        customerNames.add(position, customerName);
        customerTransactions.add(transaction, amount);
    }

    public void removeName(int position) {
        customerNames.remove(position);
    }

    public String searchName(String customerName) {
        boolean exists = customerNames.contains(customerName);
        if(exists) {
            return customerName;
        } else {
            return null;
        }
    }

    public int searchPosition(String customerName) {
        boolean exists = customerNames.contains(customerName);
        if(exists) {
            return customerNames.indexOf(customerName);
        } else {
            return -1;
        }
    }

    public ArrayList<String> getCustomerNames() {
        return customerNames;
    }

    public ArrayList<Double> getCustomerTransactions() {
        return customerTransactions;
    }

    public void setCustomerNames(ArrayList<String> customerNames) {
        this.customerNames = customerNames;
    }

    public void setCustomerTransactions(ArrayList<Double> customerTransactions) {
        this.customerTransactions = customerTransactions;
    }
}
