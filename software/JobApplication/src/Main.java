import java.util.ArrayList;

/**
 * Created by eliyooy on June 20, 2016.
 */
public class Main {

    public static void main(String[] args) {

        CodeFixer fixer = new CodeFixer();

        String result = fixer.processText(fixer.loadText());

        System.out.println(result);

    }
}
