package task01.test;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;
import task01.app.Employee;

public class EmployeeTest {

    @Test
    public void testUserStatusText() {
        Employee employee = new Employee("Elek", "Teszt", "tesztelek",
                LocalDate.of(1999, 01, 01), true);
        String actual = employee.getStatusText();
        String expected = "aktív";
        Assert.assertEquals(expected, actual);
    }
}
