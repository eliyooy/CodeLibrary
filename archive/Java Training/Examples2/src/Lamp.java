/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class Lamp {

    private int height;
    private int lumins;
    private String color;

    public Lamp(int height, int lumins, String color) {
        this.height = height;
        this.lumins = lumins;
        this.color = color;
    }

    public void turnOnLamp(int lumins) {
        System.out.print("Lamp is on.  Light at " + lumins + " lumins.");
    }

}
