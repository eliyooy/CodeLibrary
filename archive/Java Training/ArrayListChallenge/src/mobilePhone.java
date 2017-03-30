import java.util.ArrayList;

/**
 * Created by eliyahudorsky on 1/27/16. BS"D
 */
public class mobilePhone {
    private ArrayList<String> nameList = new ArrayList<>();

    public void addName(String name) {
        nameList.add(name);
    }

    public void modifyName(int position, String oldName, String newName) {
        position = nameList.indexOf(oldName);
        nameList.set(position, newName);
    }

    public void removeName(String name) {
        nameList.remove(nameList.indexOf(name));
    }

    public String searchName(String name) {
        boolean exists = nameList.contains(name);
        if(exists) {
        return name;
        } else {
            return null;
        }
    }

    public int positionSearch(String name) {
        boolean exists = nameList.contains(name);
        if (exists) {
            return nameList.indexOf(name);
        } else {
            return -1;
        }
    }


}
