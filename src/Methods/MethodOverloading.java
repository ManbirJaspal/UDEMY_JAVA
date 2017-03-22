package Methods;

/**
 * Created by manbir on 3/22/2017.
 */
public class MethodOverloading {

    public MethodOverloading() {
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0.0D && inches >= 0.0D && inches <= 12.0D) {
            double centimeters = feet * 12.0D * 2.54D;
            centimeters += inches * 2.54D;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        } else {
            System.out.println("invalid feet or inches entered");
            return -1.0D;
        }
    }

    public static int calcFeetAndInchesToCentimeters(int inches) {
        if(inches >= 0) {

        }

        return -1;
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(-10.0D, 5.0D);
    }
}
