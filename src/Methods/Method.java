package Methods;

/**
 * Created by manbir on 3/22/2017.
 */
public class Method {

    public Method() {
    }

    public static void displayHighScorePosition(String Pname, int Position) {
        System.out.println(Pname + "  managed to get into position  " + Position + "  on the high score table");
    }

    public static int calculateHighscorePosition(int score) {
        return score > 1000?1:(score > 500 && score < 1000?2:(score > 100 && score < 500?3:4));
    }

    public static void main(String[] args) {
        int highscoreposition = calculateHighscorePosition(1500);
        displayHighScorePosition("manbir", highscoreposition);
        highscoreposition = calculateHighscorePosition(900);
        displayHighScorePosition("heera", highscoreposition);
        highscoreposition = calculateHighscorePosition(400);
        displayHighScorePosition("BOB", highscoreposition);
        highscoreposition = calculateHighscorePosition(50);
        displayHighScorePosition("Tim", highscoreposition);
    }
}
