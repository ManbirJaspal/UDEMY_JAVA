package Encapsulation;

/**
 * Created by manbir on 3/28/2017.
 */
public class CodeExecute {

    public static void main(String args[]) {
//        Player player = new Player();
//        player.name = "tim";            *********wromg way of encapsulation, too many issues (executing PLAYER)****
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " +player.healthRemaining());
//
//        damage =11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Reamining HEalth =  "+ player.healthRemaining());
//    }
//}

//***************Proper Encapsulation using private field in EnhancedPlayer**********************
        EnhancedPlayer player = new EnhancedPlayer("manbir", 200, "Sword");
        System.out.println(" Initial health is " + player.getHealth());

    }
}
