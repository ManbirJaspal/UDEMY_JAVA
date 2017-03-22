package Composition;

/**
 * Created by manbir on 3/22/2017.
 */
public class CodeExecute {

    public static void main(String args[]) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440)); //called a class method without a variable
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        ****************wont work now because we deleted the getters******************
//        thePC.getMonitor().drawPixel(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerup();
    }
}
