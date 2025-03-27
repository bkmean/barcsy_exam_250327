package task02.app;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ElectricCar eCar1 = new ElectricCar("Honda", 2020, "Black", "City Power", 5500, 450);
        System.out.println("ecar1 " + eCar1);
        ElectricCar eCar2 = new ElectricCar("BMW", 2022, "White", "i3", 5500, 500);
        System.out.println("ecar2 " + eCar2);
        ElectricCar eCar3 = new ElectricCar("Opel", 2019, "red", "Ampera", 3000, 299);
        System.out.println("ecar3 " + eCar3);

    }
}
