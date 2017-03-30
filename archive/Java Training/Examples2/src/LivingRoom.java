/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class LivingRoom {

    private Couch brownCouch;
    private Lamp blackLamp;

    public LivingRoom(Couch brownCouch, Lamp blackLamp) {
        this.brownCouch = brownCouch;
        this.blackLamp = blackLamp;
    }

    public void powerUp() {
        getBlackLamp().turnOnLamp(15);
    }

    public Couch getBrownCouch() {
        return brownCouch;
    }

    private Lamp getBlackLamp() {
        return blackLamp;
    }


}
