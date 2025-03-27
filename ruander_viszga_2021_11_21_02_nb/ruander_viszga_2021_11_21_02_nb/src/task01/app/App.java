package task01.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee employee = getEmployeeInput();
        displayEmployeeData(employee);
        Employee employee1 = getEmployeeInput();
        displayEmployeeData(employee1);
        Employee employee2 = getEmployeeInput();
        displayEmployeeData(employee2);
    }

    private static Employee getEmployeeInput() {
        String field = "First name:";
        String nameFirst = getNameInput(field);
        field = "Last name:";
        String nameLast = getNameInput(field);
        field = "User name:";
        String nameUser = getUserNameInput(field);
        field = "Status(0=inactive, 1=active)";
        boolean status = getUserStatus(field);
        field = "Date of Birth:";
        LocalDate birthDate = getBirthLocalDate(field);
        Employee employee = new Employee(nameFirst, nameLast, nameUser, birthDate, status);
        return employee;
    }

    private static String getInputString(String field) {
        System.out.println(field);
        return SCANNER.nextLine();
    }

    private static String warningText(String field) {
        field = field.replaceAll(":", "");
        field = field.replaceAll("Helytelen ", "");
        field = field.replaceAll(", add meg újra", "");
        return "Helytelen: " + field + ", add meg újra";
    }

    private static String getNameInput(String field) {
        String input = getInputString(field);
        String regex = "[A-Z,Ö,Ü,Ó,Ú,Ő,Ű,Á,É,Í,\\s]+";
        String chkString = input.toUpperCase();
        if (chkString.isBlank() || !chkString.matches(regex)) {
            field = warningText(field);
            input = getNameInput(field);
        }
        input = input.trim();
        return input;
    }

    private static String getUserNameInput(String field) {
        String input = getInputString(field);
        if (input.isBlank()) {
            field = warningText(field);
            input = getUserNameInput(field);
        }
        input = input.replaceAll("\\s", "");
        return input;
    }

    private static boolean getUserStatus(String field) {
        String input = getInputString(field);
        boolean status = false;
        String regex = "^[0,1]";
        if (input.isBlank() || !input.matches(regex)) {
            field = warningText(field);
            status = getUserStatus(field);
        }
        if (input.equals("1")) {
            status = true;
        }
        return status;
    }

    private static LocalDate getBirthLocalDate(String field) {
        Date date = getBirthDate(field);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(dateFormat.format(date));
        return birthDate;
    }

    private static Date getBirthDate(String field) {
        String input = getInputString(field);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateFormat.parse(input);
        } catch (ParseException ex) {
            field = warningText(field);
            date = getBirthDate(field);
        }
        return date;
    }

    private static void displayEmployeeData(Employee employee) {
        System.out.println(employee + " age=" + employee.getAge());
    }

}
