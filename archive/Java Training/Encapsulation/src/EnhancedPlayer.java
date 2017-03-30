/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class EnhancedPlayer {

    private String name;
    private int health = 100;
    private String implement;

    public EnhancedPlayer(String name, int health, String implement) {
        this.name = name;

        if(health >0 && health <=100) {
            this.health = health;
        }

        this.implement = implement;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player must replenish.");
        }
    }

    public int getHealth() {
        return health;
    }
}
