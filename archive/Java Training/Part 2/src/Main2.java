/**
 * Created by eliyahudorsky on 1/18/16. BS"D
 */
public class Main2 {
    public static void main(String[] args) {

        // Code Blocks and Control Statements (if, else, else if)

        int score = 5000;
        boolean gameOver = true;

        calculateScore(true, 800); /* METHODS The if block and variables above below would not be necessary with this method, see below
         also, notice that you can revalue the sent over variables, you can also value them outside (above) if needed*/

        calculateScore(gameOver, score); /* METHODS Make the values the same as the method below */

        int highScore = calculateScore(gameOver, score); /*METHODS Methods can be assigned to variables.  This is a way of
        managing and using return values.*/

        if (score == 5000) {
            System.out.println("Your score was 5000");
            System.out.println("You won!"); /* Second line not possible without braces */
        }

        if (score < 5000) {
            System.out.println("You lost!");
        } else {
            System.out.println("You won!");
        }

        if (score > 5000) {
            System.out.println("High score!");
        } else if (score > 2500) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }

        if (score > 2500 && score < 5500) {
            System.out.println("Good job!");
        }

        if (gameOver) { /*<--- Notice "gameOver" is an abbreviation of gameOver = true; */
            int finalScore = 10000; /*Variables made in the code block cannot be accessed outside the code block*/
        }

        /* Practice */
        int secondScore = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (secondScore > 9000) {
            System.out.println("You just completed level " + levelCompleted + "." + " Your score was " + (secondScore +
                    bonus));
        } else if (secondScore > 5000)
            System.out.println("You just completed level " + levelCompleted + "." + " Your score was excellent");
        else {
            System.out.println("You lost!");
        }

        int highscorepos = calculateHighScorePosition(1500);
        displayHighScorePosition("Alan", highscorepos);

        highscorepos = calculateHighScorePosition(900);
        displayHighScorePosition("Billy", highscorepos);

        highscorepos = calculateHighScorePosition(400);
        displayHighScorePosition("Charles", highscorepos);

        highscorepos = calculateHighScorePosition(50);
        displayHighScorePosition("Darren", highscorepos);
    }

    // Methods (also see directly above and at top)

    public static int calculateScore(boolean gameOver, int score) {/* <--- A new method, sends parameters in the parentheses */
       /* Individual variables become unecessary, they are made in the parentheses above,
        public static void if you just want to send data; int (or other variable) allows you to receive data back */

        if (score == 5000) {
            int finalScore = score;
            finalScore += 500;
            System.out.println("Your score was 5000");
            System.out.println("You won!");
            return finalScore; /* return sends the information back to the other method above so the methods can "talk"
            to each other */
        } else {
            return -1;
        }

        /* alternative return -1 outside */


    }

   /* Practice */

    public static void displayHighScorePosition(String playersname, int highscorepos) {
        System.out.println(playersname + " managed to get into " + highscorepos + " position.");
    }

    public static int calculateHighScorePosition(int highscorepos) {
        if (highscorepos > 1000) {
            return 1;
        } else if (highscorepos < 1000 && highscorepos > 500) {
            return 2;
        } else if (highscorepos < 500 && highscorepos > 100) {
            return 3;
        } else {
            return 4;
        }
    }

    // Method Overloading (same method name, different parameters)

    public static int calculatePoints(String name, int points) {
        System.out.println("Hello");
        return points * 20;
    }

    public static int calculatePoints(int points) { /* Allowed if parameters varied, could even have no parameters */
        System.out.println("Hello");
        return points * 20;
    }

    /* Practice */

//    public static int feetandcm(double feet, double inch) {
//        if (!(feet >= 0) || !(inch >= 0 && inch <= 12))
//            return -1;
//        }
//    }
//
//    public static int feetandcm(double inch) {
//        if (!(inch >= 0)) {
//            return -1;
//        }
//        return -1;
//    }
}




