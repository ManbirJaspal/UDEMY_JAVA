package Encapsulation;

/**
 * Created by manbir on 3/28/2017.
 */                                //*******changing fields to private to make it more secure**************
public class EnhancedPlayer {

    private String name;
    private int hitpoints = 100;   //*****changed health to hitpoints but not the getter name since its being accessed by the codeexecute class*****
                                    // with this change the code execute class cannot directly change the value of health, since it doesnt know that in
                                    // Enhanced player class health has changed to hitpoints.
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitpoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitpoints = this.hitpoints - damage;
        if (this.hitpoints <= 0) {
            System.out.println("Player knocked out");
            //reduce no. of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitpoints;
    }
}
