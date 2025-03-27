package task03.test;

import org.junit.Assert;
import org.junit.Test;
import task03.app.Food;

public class FoodTest {

    @Test
    public void getDiscountedPriceTest() {
        Food food = new Food("Tonhalas Pizza", 5000.0, true);
        double actual = food.getDiscountedPrice();
        double expected = 4500.0;
        Assert.assertEquals(expected, actual, 0.0);
    }
}
