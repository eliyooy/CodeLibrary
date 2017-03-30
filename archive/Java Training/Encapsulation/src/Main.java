/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.implement = "Stethoscope";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Stethoscope");
        System.out.println("Initial health is " + player.getHealth());

        Printer brother = new Printer(22, 0, false);
        System.out.println("Printer start-up successful. Ink level is " + brother.getTonerLevel() + "% Number of pages " +
                "printed is " + brother.getPagesPrinted() + ". Double sided set to " + brother.isDoubleSided() + ".");
        brother.fillToner(13);
        brother.pagesPrinted(30, brother.isDoubleSided());
    }
}
