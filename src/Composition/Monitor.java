package Composition;

/**
 * Created by manbir on 3/22/2017.
 */
public class Monitor {


    private String model;
    private String manufaturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufaturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufaturer = manufaturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);

    }

    public String getModel() {
        return model;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
