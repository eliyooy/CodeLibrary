/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */

class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Book {
    public Jaws () {
        super("Jaws");
    }

    public String plot() {
        return "A shark causes havoc at a beach community.";
    }
}

class Hamlet extends Book {
    public Hamlet() {
        super("Hamlet");
    }

    @Override
    public String plot() {
        return "The nephew of a royal family contemplates his future.";
    }
}

class BarnBurning extends Book {
    public BarnBurning() {
        super("Barn Burning");
    }

    @Override
    public String plot() {
        return "A child confronts his family's legacy of arsonist acts.";
    }
}

class GolfMadeEasy extends Book {
    public GolfMadeEasy() {
        super("Golf Made Easy");
    }

    @Override
    public String plot() {
        return "Instruction book on golf.";
    }
}

class forgettableBook extends Book {
    public forgettableBook() {
        super("Forgettable");
    }

    // No plot method
}


public class Main {
    public static void main(String[] args) {
        for(int i=1; i<11; i++) {
            Book book = randomBook();
            System.out.println("Book # " + i + ":" + book.getName() + "\n" + /* <-- \n new line */
            "Plot: " + book.plot() + "\n");
        }
    }

    public static Book randomBook() {
        int randomNumber = (int) ((Math.random() * 5) + 1);
        System.out.println("Random number generated was " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new Hamlet();

            case 3:
                return new BarnBurning();

            case 4:
                return new GolfMadeEasy();

            case 5:
                return new forgettableBook();

        }
        return null;
    }
}
