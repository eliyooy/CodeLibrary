/**
 * Created by eliyahudorsky on 1/23/16. BS"D
 */

public class Main {
    public static void main (String[] args) {
        Toyota green = new Toyota("Green car", 50, 40, 4, 100, 4, 7, 10);

        green.operate();

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27-inch Large", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("RJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getThecase().pressPowerButton();

        thePC.powerUp();
    }
}
