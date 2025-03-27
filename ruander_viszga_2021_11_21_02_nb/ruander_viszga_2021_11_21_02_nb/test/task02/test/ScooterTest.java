package task02.test;

import org.junit.Assert;
import org.junit.Test;
import task02.app.Car;

public class ScooterTest {

    @Test
    public void isOldTest() {
        Car scooter = new Car("BestScooterFor4U", 2020, "fehér", "TRE-4456");
        Boolean actual = scooter.isOld();
        Boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
}
