import java.util.Iterator;
import java.util.LinkedList;

/**
 * BS"D
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("Oklahoma");
        placesToVisit.add("Nebraska");
        placesToVisit.add("North Dakota");
        placesToVisit.add("Maine");

        printList(placesToVisit);

        placesToVisit.add(1, "Idaho");
        printList(placesToVisit);

        System.out.println(placesToVisit.get(1));
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("\n");
    }
}
