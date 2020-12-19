package se.lexicon.samuel;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;
    //this dimensions declared literally becomes a new class and can carry characteristics to be shared here
    //so a fresh class can be used to define its characteristics

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
