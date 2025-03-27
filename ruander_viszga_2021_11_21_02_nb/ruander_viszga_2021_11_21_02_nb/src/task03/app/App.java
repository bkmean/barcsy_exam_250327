package task03.app;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Food pizza1 = new Food("Pizza Sonkás", 3900.0, false);
        Food pizza2 = new Food("Hawaii pizza", 4500.0, true);
        OrderItem item1 = new OrderItem(pizza1, 2);
        OrderItem item2 = new OrderItem(pizza2, 1);

        Map<Integer, OrderItem> customer1 = new HashMap<>();
        customer1.put(1, item1);
        customer1.put(2, item2);
        String billCust1 = "1";
        Order order1 = new Order(Long.valueOf(billCust1), customer1);
        System.out.println("A rendelés azonosítója: " 
                + billCust1 + ", teljes összege: " 
                + order1.getTotalCost() + " Ft");
    }
}
