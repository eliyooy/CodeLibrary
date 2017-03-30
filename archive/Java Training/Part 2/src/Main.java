/**
 * Created by eliyahudorsky on 1/17/16. BS"D
 */
public class Main {
    public static void main(String[] args) {

        // Terminology
         /* Statement (data type, variable) --->*/int /* Expression --->*/ /* Operator --->*/ myExample = 100; /*<--- Value */
        if(/*Expression--->*/myExample == 100)
            System.out.println(/*Expression*/"Hello");


        // Primitive Data Types - bytes, short, int, long
        byte myByteValue = -128 /* to 127, width of 8*/;
            byte myNewByteValue = (byte) (myByteValue/2);

        short myShortValue = -32768 /* to 32767, width of 16*/;
            short myNewShortValue = (short) (myShortValue/2);

        int myIntValue = -2_147_483_648 /*to 2147483647, width of 32, int assumed with whole numbers*/;

        long myLongValue = -9_223_372_036_854_775_808L /*to value -1; width of 64 */;

        /*Practice, notice use of L with long and lack of casting*/
        byte testByte = 100;
        short testShort = 10000;
        int testInt = 500;
        long testLong = 50000L + (testByte*10L) + testShort + testInt;
        System.out.println(testLong);

        //Primitive Data Types - float, double
        float myFloatValue = 5.4f; /*also (float) casting possible, width of 32, 7 decimal places*/
        double myDoubleValue = 5d /*double assumed with decimal numbers, width of 64, 17 decimal places*/;
        System.out.println(myDoubleValue);

        /*Practice*/
        int testInt2 = 15;
        double testDouble = testInt2 * 0.45359237d;
        System.out.println(testDouble);

        //Primitive Data Types - char, boolean
        char myChar = 'D'; /* Width of 16 */
        char mySpecialChar = '\u00A9'; /*Copyright symbol*/
        boolean myBoolean = true;

        //Transition from Primitive to Class Data Types - String
        String mystring = "This is a string";
        mystring = mystring + ", and this is more";
        System.out.println(mystring);

        String numberstring = "250.9";
        numberstring = numberstring + "200.01"; /* not treated like a number */
        System.out.println(numberstring);

        String laststring = "10";
        int myStringInt = 50;
        laststring = laststring + myStringInt;
        System.out.println(laststring);

        // Basic Operators
        int /*this is an operator --> */ result = 1 + 2;

        int previousResult = result;

        result = result - 1;

        System.out.println(previousResult);
        System.out.println(result); /* notice the progression of values of "result" down the code */

        result = result % 3; /* % gives the remainder after dividing into the number */
        result++; /* incrementally add 1 to result, also possible with --  */
        result += 2; /* add a chosen increment to result, also possible with -= *= and /= */

        // Operators - if Statements

        boolean isAmerican = false;
        if (isAmerican == false)
            System.out.println("He is not American");
        /* note that = is an assignment variable, whereas == is a evaluating variable */

        int topScore = 99;
        if (topScore != 100)
            System.out.println("This is not the score!");
        /* = == != >= <= > < */

        int secondScore = 100;
        if (topScore == 99 && secondScore !=100)
            System.out.println("There it is!");
        if (topScore == 99 || secondScore == 200)
            System.out.println("The or variable!");
        if ((topScore < secondScore) || (secondScore > 200))
            System.out.println("There it is again!");

        // Operators - ternary statements
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;

        /* Practice */
        double firstDouble = 20d;
        double secondDouble = 80d;
        double doubleMultiply = (firstDouble + secondDouble) * 25;
        double myRemainder = doubleMultiply % 2300;
        if (myRemainder <= 200)
            System.out.println("Total was over the limit");


    }
}
