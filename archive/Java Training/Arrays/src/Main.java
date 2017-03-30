import java.util.Scanner;

/**
 * Created by eliyahudorsky on 1/26/16. BS"D
 */
public class Main {
    public static void main(String[] args) {

        // Basic Arrays
//        int[] myIntArray = new int[10]; // <---- version 1
//        double[] myDoubleArray = new double[10]; // <--- alternate version 1

//        myIntArray[5] = 50; // <--- initializing values
//        for(int i=0; i<10; i++) {     // <---- alternate initializating values
//            myIntArray[i] = i*10;
//        }
//
//        for(int i=0; i<myIntArray.length; i++) { // <---- alternate initializing values (.length) more flexible
//            myIntArray[i] = i*10;
//        }
//
//        int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // <--- version 2
//
//        System.out.println(myIntArray[5]); // <--- position number
//
//        printArray(myIntArray); // <---- passing arrays, see below

        // Scanners

        int[] myIntegers = getIntegers(5); // <--- myIntegers receives from getIntegers(below)

        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

    }

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r"); // Number is defined as 5
        int[] values = new int[number]; // A new int with 5 slots is values

        for (int i=0; i<values.length; i++) {   // Values runs its length for i, assigning scanner values
            values[i] = scanner.nextInt();
        }
        return values; // Method returns the assigned values for processing above.  See video (Arrays) for averages.
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            array[i] = i*10;
        }
    }
}
