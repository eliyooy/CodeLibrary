/**
 * Created by eliyahudorsky on 1/18/16. BS"D
 */
public class Main3 {
    public static void main(String[] args) {

        // Switch Statements

        int switchValue = 1;

        /* The switch statement can be used with byte, int, short, and char */
        switch (switchValue) { /* if statements require more writing but allow for testing multiple variables */
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5: /*shortcut*/
                System.out.println("Value was not 1 or 2");
                break; /* Without break, computer will continue on to the next case or next break */
            default:
                System.out.println("Was not 1 or 2");
                break; /* Break not needed for default, but can be left for clarity */
        }

        /* Dealing with case sensitivity with strings, make sure to test in lower case,
         upper case available also */
        String month = "January";
        switch (month.toLowerCase()) {
        }

        /* Practice */

        char myChar = 'A';

        switch (myChar) {
            case 'A':
                System.out.println("Char was A");
                break;
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Char was " + myChar);
                break;
            default:
                System.out.println("Not found.");
        }

        // For Statements (Loops)

        for (/*Initialization (at start)*/ int i = 0; /*Termination (continues loop until false)*/ i < 5; /*Increment(progression of the loop)*/i++) {
            System.out.println("Loop" + i + "next!");
        }

        //calculateInterest(10000, for(2, 9, ++));

        whileExample(0);

        whileAlt(0);


    }

        /* Practice */

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100.0));
    }
        /* see above */

    int count = 0; /* great method to forcing a break after a certain number of results (see lecture 32)
    must be outside the for statement*/

    // While and Do While Statements

    public static void whileExample(int count) {
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        } /* This is the same as for(int i=1; i<5; i++), except for says "continue until this is true."  While says
        "continue so long as this is true") */
    }

    public static void whileAlt(int count) { /*useful alternative method */
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
    }

    public static void doWhile(int count) {
        do {  /* <---- Do this (guaranteed to execute at least once, unlike while which never executes if starting true */
            System.out.println("Count value was " + count);
            count++;

            /* you can include an if statement to break also here */
        } while (count != 6); /* <----- so long as this is true */
    }

//    int number=1;
//    int finishNumber=20;
//    while(number <= finishNumber) {
//        if(!isEvenNumber(number)) {
//            number++;
//            continue; /* Continue means "start loop over" without all instructions, instead of finishing completely */
//        }
//        System.out.println("Even number " + number);
//        number++;
//    }
//
//}
//
//    public static boolean isEvenNumber(int number) {
//        if((number % 2) == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    int number=1;
//    int finishNumber=20;
//    int increment=1;
//    while(number <= finishNumber) {
//        if(!isEvenNumber(number)) {
//            number++;
//            continue; /* Continue means "start loop over" without all instructions, instead of finishing completely */
//        }
//        System.out.println("Even number " + number + ". The number of even numbers is " + increment + ".");
//        number++;
//        increment++;
//
//        if(increment >= 6) {
//            break;
//        }
//    }
//    System.out.println("The total number of even numbers is " + (increment - 1));
//
//}
//
//    public static boolean isEvenNumber(int number) {
//        if((number % 2) == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}




