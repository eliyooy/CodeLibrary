/**
 * Created by eliyahudorsky on 1/26/16. BS"D
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] sortNumbers = getIntegers(5);

        for (int i = 0; i < sortNumbers.length; i++) {
            switch (i) {
                case 1:
                    sortNumbers[1];
            }
        }

    }

    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int numbers) {
        int values[] = new int[numbers];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}

/* Swapping Values

for(int i=1; i<sortedArray.length-1; i++)
    if(sortedArray[i] < sortedArray[i+1]) {
    temp = sortedArray[i]
    sortedArray[i] = sortedArray[i+1]
    sortedArray[i+1] = temp;
    flag = true;

Resizing Arrays
Save the original data in a new array and then resize the array from there.
 */
