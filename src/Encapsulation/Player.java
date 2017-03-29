package Encapsulation;

/**
 * Created by manbir on 3/28/2017.
 */
public class Player {

    public String fullname;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health-damage;
        if (this.health <=0) {
            System.out.println("Player knocked out");
            //reduce no. of lives remaining for the player

        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
