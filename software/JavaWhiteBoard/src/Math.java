/**
 * BS"D
 */
public class Math {

    int sampleInt;

    public void addMath() {
        int newInt = sampleInt + 1;
        Double d = new Double(111.1);
        System.out.println("The value of sampleInt + 1 is " + newInt);
    }

    public static class InnerMath {

        public int addMathAgain(int superSampleInt, int otherSampleInt) {
            int result = superSampleInt + otherSampleInt;
            return result;
        }
    }

    public class nonStaticMath {
        public int myMathAgain(int number, int otherNumber) {
            int result2 = number + otherNumber;
            return result2;
        }
    }

    public boolean startsWithCapitalLetter(String entry) {
        char firstLetter = entry.toCharArray()[0];

        if(Character.isUpperCase(firstLetter) && Character.isLetter(firstLetter)) {
            return true;
        } else {
            return false;
        }
    }

    public String throwAStatement() {
        return "Hello";
    }


}
