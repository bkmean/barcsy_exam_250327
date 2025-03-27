package task01.app;

import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LocalDate birtDate = LocalDate.of(2000, 01, 11);
        Employee employee = new Employee("First Name", "Last Name", "User Naame", birtDate, Boolean.TRUE);
        System.out.println(employee + ", age=" + employee.getAge() );
    }

}
