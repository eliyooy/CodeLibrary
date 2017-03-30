public class Application {
    /*Method*/
    public static void main(Strings[] args) {
        /*Primitive Variables and Parameters*/
        int myNumber = 0;
        /* or this: int myNumber;
        myNumber = 0; */
        short myShort = 847;
        long myLong = 9797;
        double myDouble = 7.3243
        char myChar = 'A';
        boolean myBoolean = true;
        byte myByte = 127;
        
         /*System.out*/
        System.out.println(loop);
        System.out.println(greeting);
        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);
        
        /*Strings and Structure*/
        /*variable*/ string text = /*instance (object)*/ "Hello";
        
        string number = 7;
        
        string greeting = text + number;
        
        /*Loops*/
        boolean loop = 4 < 5;
        
        /*While Loops and Classes*/
            int loop = 0;
            
            while (true) {
                System.out.println("Hi");
            }
            
            if(loop == 5) {
                break;
            }
            
            loop++;
        
        /*For Loops and printf*/
            for(/*before*/ int i=0; /*concurrent*/ i < 5; /*after*/ i = i + 1 /* or i++ */) {
                System.out.println("The value of i is: " + i);
                System.out.printf("The value of i is: %d\n", i);
                System.out.println();
                
                
            }
        
        /*Conditional Statements*/
        
            boolean cond = 1 != == <= >= > < 6;
            
            System.out.println(cond);
            
            int myInt = 20;
            
            if(myInt == 30) {
                System.out.println ("Yes, it's true!")
            }
            
            else if(myInt == 10){
                System.out.println("This alternative is true!")
            }
            
            else {
                System.out.println("They're false!")
            }
        
        /*User Input*/
        
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter a line of text: ")
            String line = input.nextline();
            System.out.println("You entered: " + line)
            /*First line: import java.util.Scanner;*/
        
        /*Do...while*/
        
            Scanner scanner = new Scanner(System.in);
            
            /*Not ideal
            System.out.println("Enter a number: ")
            
            int value = scanner.nextInt();
            
            while(value !=5) {
                value = scanner.nextInt();
            }
            */
            
            int value = 0;
            do {
               System.out.println("Enter a number: ")
               value = scanner.nextInt();
            }
            while(value != 5);
            
            System.out.println("Got 5!")
        
        /*Switch*/
        
            Scanner input = new Scanner(System.in);
            
            System.out.println("Please enter a command: ");
            String text = input.nextLine();
            
            switch(text) {
                case "start":
                    System.out.println("Machine started!")
                    break;
                case "stop":
                    System.out.println("Machine stopped!")
                    break;
                default:
                    System.out.println("Command not recognized.")
            }
        
        /*Arrays: Integers*/
        
            int value = 7;
            
            int[] values;
            values = new int[3];
            
            System.out.println(values[0]);
            
            values[0] = 10;
            values[1] = 20;
            values[2] = 30;
            
            Systems.out.println(values[0]); /*will produce 10*/
            Systems.out.println(values[1]);
            Systems.out.println(values[2]);
            
            for(int i=0; i<values.length; i++) {
                System.out.println(values[i])
            }
            
            int[] numbers = {5, 6, 7};
            
            for(int i=0; i<numbers.length; i++) {
                Systems.out.println(numbers[i]);
            }
        
        /*Arrays: Strings*/
            String[] words = new String[3];
            
            words[0] = "Hello";
            words[1] = "to";
            words[2] = "you";
            
            System.out.println(words[2]); /*will produce "you"*/
            
            String[] fruits = {"date", "prune", "fig"}
            
            for(String fruitlist: fruits) {
                System.out.println(fruitlist);
            }
            
            int value = 0;
            
            String text = null;
            
            System.out.println(text);
            
            String[] texts = new String[2];
            
            System.out.println(text); /*prints value null*/
    }
}