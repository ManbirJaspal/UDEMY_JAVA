package Composition;

/**
 * Created by manbir on 3/22/2017.
 */
public class PC {

    //we dont use the extends keyword because it limits us to one class;
    // we directly call classes by the way below to call mutliple classes

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
//******************* in public ****************************
//    public Case getTheCase() {
//        return theCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }

//    ************************in Private************************   // to make it less accessible

//        public void powerup(){
//        getTheCase().pressPowerButton(); //accessing using getter(getTheCase).
//        }

//        private Case getTheCase() {
//            return theCase;
//        }
//
//            private Monitor getMonitor() {
//                return monitor;
//            }
//
//            private Motherboard getMotherboard() {
//                return motherboard;
//    }

//    ****************WITHOUT USING GETTERS AND BY USING THE VARIABLE DIRECTLY*********************

    public void powerup()
    {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixel(1200,50,"yellow");
    }
}
