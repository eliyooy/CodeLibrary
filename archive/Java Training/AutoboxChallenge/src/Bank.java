import java.util.ArrayList;

/**
 * Created by eliyahudorsky on 1/28/16. BS"D
 */
public class Bank {
    ArrayList<String> branchIndex = new ArrayList<>();
    ArrayList<String> branchList = new ArrayList<>();

    public void addBranch(String clientName) {
        branchList.add(clientName);
    }

    public void removeBranch(String clientName) {
        branchList.remove(clientName);
    }

    public String searchBranch(String clientName) {
        boolean exists = branchList.contains(clientName);
        if(exists) {
            return clientName;
        } else {
            return null;
        }
    }

    public int searchBranchPosition(String branchName) {
        boolean exists = branchList.contains(branchName);
        if(exists) {
            return branchList.indexOf(branchName);
        } else {
            return -1;
        }
    }

    public String searchByBranchPosition(int position) {
            return branchList.get(position).toString();
    }

    public ArrayList<String> getBranchList() {
        return branchList;
    }
}
