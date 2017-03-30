import java.util.ArrayList;

/**
 * Created by eliyahudorsky on 1/27/16. BS"D
 */
public class Main {
    public static void main(String[] args) {

        /* Basics of Autoboxing and Unboxing */
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);
        ArrayList<Integer> intArrayList = new ArrayList<>();
        for(int i=0; i<=10; i++) {   // <---- automating adding of values to an array
            intArrayList.add(Integer.valueOf(i)); // autoboxing - taking the primitive type and converting it to a class
        }

        for(int i=0; i<=10; i++) {
            System.out.println(i + " ---> " + intArrayList.get(i).intValue()); // <---- unboxing - taking the class value
            // and converting it back to a primitive type
        }

        /* Shortcuts */
        Integer myIntValue = 56; // <--- compiled as Integer.valueOf(56);
        int myInt = myIntValue; // <--- compiled as myInt.intValue();

        /*Example with and without shortcuts */
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl)); // shortcut remove Double.valueOf and parentheses
        }
        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue(); // shortcut remove doubleValue()
            System.out.println(i + " ---> " + value);
        }
    }
}
