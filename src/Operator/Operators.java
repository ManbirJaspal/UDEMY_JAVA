package Operator;

/**
 * Created by manbir on 3/22/2017.
 */
public class Operators {

    public static void main(String[] args) {
        double no1 = 20.0D;
        double no2 = 80.0D;
        double no3 = (no1 + no2) * 25.0D;
        System.out.println("no3 is " + no3);
        double rem = no3 % 40.0D;
        System.out.println(rem);
        if (rem <= 20.0D) {
            System.out.println("total was over the limit");
        }
    }
}
