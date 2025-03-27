package task05.test;

import org.junit.Assert;
import org.junit.Test;
import task05.app.entity.MotorCycle;
import task05.app.entity.MotorCycleCategory;

public class MotorCycleTest {

    @Test
    public void getIsActiveText() {
        MotorCycleCategory motorCycleCategory = new MotorCycleCategory(1,
                "Bagger");
        MotorCycle motorCycle = new MotorCycle(1, "Honda", "TEF-234",
                motorCycleCategory, true);
        String actual = motorCycle.getStatusText();
        String expected = "aktív";
        Assert.assertEquals(expected, actual);
    }
}
