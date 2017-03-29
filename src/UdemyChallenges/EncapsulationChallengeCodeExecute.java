package UdemyChallenges;

/**
 * Created by manbir on 3/28/2017.
 */
public class EncapsulationChallengeCodeExecute {

    public static void main(String args[]) {

        EncapPrinter printer = new EncapPrinter(50, false);  //set duplex to fault to check as well
        System.out.println("Initial page count =  " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was =  " + pagesPrinted + "  new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was =  " + pagesPrinted + "  new total print count for printer = " + printer.getPagesPrinted());



    }
}
