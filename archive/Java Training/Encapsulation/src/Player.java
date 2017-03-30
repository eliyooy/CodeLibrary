/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class Player {

    public String name;
    public int health;
    public String implement;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player must replenish.");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
