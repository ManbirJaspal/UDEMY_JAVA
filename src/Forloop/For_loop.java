package Forloop;

/**
 * Created by manbir on 3/22/2017.
 */
public class For_loop {

    public static double calculateinterest(double amount, double interestRate) {
        return amount * (interestRate / 100.0D);
    }

    public static void main(String[] args) {
        for(int i = 8; i >= 2; --i) {
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f", new Object[]{Double.valueOf(calculateinterest(10000.0D, (double)i))}));
        }

    }
}
