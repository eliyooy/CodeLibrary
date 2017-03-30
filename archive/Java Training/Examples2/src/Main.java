/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class Main {
    public static void main(String[] main) {

        Couch brownCouch = new Couch(20, "Sears");
        Lamp blackLamp = new Lamp(10, 100, "black");

        LivingRoom myLivingRoom = new LivingRoom(brownCouch, blackLamp);

        myLivingRoom.getBrownCouch().formCouch();
        myLivingRoom.getBrownCouch().reclineCouch(15);
        myLivingRoom.powerUp();


    }
}
