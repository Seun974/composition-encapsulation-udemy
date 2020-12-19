package se.lexicon.samuel;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeRevolution;
    //this resolution becomes a new class and can carry characteristics to be shared here
    //that way it inherits it from the class when defined

    public Monitor(String model, String manufacturer, int size, Resolution nativeRevolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeRevolution = nativeRevolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixels at " + x + "," + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeRevolution() {
        return nativeRevolution;
    }
}
