package task04.test;

import org.junit.Assert;
import org.junit.Test;
import task04.app.FootWear;

public class FootWearTest {

    @Test
    public void getisNotSaleText() {
        FootWear footwear = new FootWear(1, "Nike", "Airmax 123", 28900.0, Byte.
                parseByte("1"), false);
        String actual = footwear.getIsSaleText();
        String expected = "nem akciós";
        Assert.assertEquals(expected, actual);
    }
}
