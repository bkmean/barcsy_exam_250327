package task03.app;

public class OrderItem {
	
	private Food food;
    private int quantity;
    
    public OrderItem(Food food, int quantity) {
        this.food = food;
        this.quantity = quantity;
    }
    
    public Food getFood() {
        return food;
    }
    
    public int getQuantity() {
        return quantity;
    }
}
