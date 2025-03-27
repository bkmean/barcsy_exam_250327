/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task02.app;

import java.util.logging.Logger;

/**
 *
 * @author Vizsga
 */
public class ElectricCar extends Car {

    private int batteryCapacity;
    private int maxDistance;

    public ElectricCar(String brand, int yearManufactured, String color, String model, int batteryCapacity, int maxDistance) {
        super(brand, yearManufactured, color, model);
        this.batteryCapacity = batteryCapacity;
        this.maxDistance = maxDistance;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public boolean canUseForLongTravel() {
        return maxDistance >= 300 ? true : false;
    }

    @Override
    public String toString() {
        return "ElectricCar{" + super.toString() + ", batteryCapacity="
                + batteryCapacity + ", maxDistance=" + maxDistance
                + ", canUseForLonfTravel=" + canUseForLongTravel();
    }

}
