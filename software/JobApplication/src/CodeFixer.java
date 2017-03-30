import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by eliyooy on June 20, 2016.
 */

public class CodeFixer {

    public String loadText() {
        String text = null;

        try {
            text = new Scanner(new File("data/code.txt")).useDelimiter("//Z").next();
        } catch (IOException e) {
            System.err.println("File not found.");
        }

        return text;
    }

    public String processText(String text) {
        char[] textArray = text.toCharArray();
        ArrayList<Character> charArrayList = new ArrayList<>();
        HashMap<Character, Integer> charMap = new HashMap<>();
        ArrayList<Character> finalArrayList = new ArrayList<>();

        loadAndSortArrayList(textArray, charArrayList);

        loadHashMap(charArrayList, charMap);

        sortCharsByOccurrence(finalArrayList, charMap);

        return trimResultByUnderscore(finalArrayList);
    }

    private ArrayList<Character> loadAndSortArrayList(char[] textArray, ArrayList<Character> charArrayList) {
        for( char currChar : textArray ) {
            if(Character.isLetter(currChar) || currChar == '_') {
                charArrayList.add(currChar);
            }
        }

        Collections.sort(charArrayList);

        return charArrayList;
    }

    private HashMap<Character, Integer> loadHashMap(ArrayList<Character> charArrayList,
                                                   HashMap<Character, Integer> charMap) {
        for( char currChar : charArrayList ) {
            if(charMap.get(currChar) != null) {
                int value = charMap.get(currChar);
                charMap.replace(currChar, value + 1);
            } else {
                charMap.put(currChar, 0);
            }
        }

        return charMap;
    }

    private ArrayList<Character> sortCharsByOccurrence(ArrayList<Character> finalArrayList,
                                                        HashMap<Character, Integer> charMap) {
        while(!charMap.isEmpty()) {

            char highestKey = (char) charMap.keySet().toArray()[0];

            for (char key : charMap.keySet()) {
                if (charMap.get(key) > charMap.get(highestKey)) {
                    highestKey = key;
                }
            }

            finalArrayList.add(highestKey);
            charMap.remove(highestKey);
        }

        return finalArrayList;
    }

    private String trimResultByUnderscore(ArrayList<Character> finalArrayList) {
        StringBuilder trimmedStatement = new StringBuilder();

        for( char currChar : finalArrayList ) {
            if(currChar == '_') {
                break;
            }

            trimmedStatement.append(currChar);
        }

        return trimmedStatement.toString();
    }
}
