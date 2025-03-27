package task03.app;

import java.util.Map;

public class Order {

    private Long id;
    private Map<Integer, OrderItem> orderItems;

    public Order(Long id, Map<Integer, OrderItem> map) {
        this.id = id;
        this.orderItems = map;
    }

    public Map<Integer, OrderItem> getOrderItems() {
        return orderItems;
    }

    public Long getId() {
        return id;
    }

    public double getTotalCost() {
        double valueTotal = 0.0;
        for (Map.Entry<Integer, OrderItem> entry : orderItems.entrySet()) {
            OrderItem item = entry.getValue();
            valueTotal += item.getOrderItemValue();
        }
        return valueTotal;
    }
}
