package task02.app;

abstract public class Vehicle {
	
	private String brand;
	private int yearManufactured;
	
    public Vehicle(String brand, int yearManufactured) {
        this.brand = brand;
        this.yearManufactured = yearManufactured;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public int getYearManufactured() {
        return yearManufactured;
    }

    public abstract void start();
    public abstract void stop();

    @Override
    public String toString() {
        return "brand=" + brand + ", yearManufactured=" + yearManufactured ;
    }
    
}
