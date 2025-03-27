package task02.app;

import java.time.LocalDate;

public class Car extends Vehicle {

    private String color;
    private String model;

    public Car(String brand, int yearManufactured, String color, String model) {
        super(brand, yearManufactured);
        this.color = color;
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("A roller elindul...");
    }

    @Override
    public void stop() {
        System.out.println("A roller megáll...");
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Boolean isOld() {
        return LocalDate.now().getYear() - this.getYearManufactured() > 10 ? true : false;
    }

    @Override
    public String toString() {
        return super.toString() + ", color=" + color + ", model=" + model;
    }

}
