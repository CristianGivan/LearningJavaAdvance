package Exercise;

import Exercise.Company.Company;
import Exercise.Company.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestCompany {

    Company company;
    List<Employee> employees = new ArrayList<>();
    List<Employee> overFifty = new ArrayList<>();
    List<Employee> fromTheSameCountry = new ArrayList<>();


    @BeforeEach
    void createTheCompany() {
        Employee employee1 = new Employee("employee1", "Romania", 50);
        Employee employee2 = new Employee("employee3", "Romania", 55);
        Employee employee3 = new Employee("employee5", "country2", 43);
        Employee employee4 = new Employee("employee2", "country1", 54);
        Employee employee5 = new Employee("employee4", "country1", 30);
        Employee employee6 = new Employee("employee6", "Romania", 20);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        System.out.println("All employees:");
        System.out.println(employees);

        company = new Company("Company", employees);
        overFifty.add(employee1);
        overFifty.add(employee2);
        overFifty.add(employee4);
        fromTheSameCountry.add(employee1);
        fromTheSameCountry.add(employee2);
        fromTheSameCountry.add(employee6);

    }

    @Test
    @DisplayName("The list of employee over fifty")
    void testEmployeeOverFifty_ShouldReturnTheListOfEmployeeOverFifty() {

        List<Employee> result = company.overFifty();
        assertEquals(overFifty, result);
        System.out.println("\nEmployees over fifty:");
        System.out.println(overFifty);
        System.out.println("\nThe list of employee over fifty");
        System.out.println(result);
    }

    @Test
    @DisplayName("The list of employee from Romania")
    void testEmployeeFromTheSameCountry_ShouldReturnTheListOfEmployeeFromRomania() {

        List<Employee> result = company.fromTheSameCountry("Romania");
        assertEquals(fromTheSameCountry, result);
        System.out.println("\nEmployees from Romania:");
        System.out.println(fromTheSameCountry);
        System.out.println("\nResult of employee from Romania");
        System.out.println(result);
    }

    @Test
    @DisplayName("The list of employees sorted  by country")
    void testFilterByCountry() {
        System.out.println();
        for (Employee employee : employees) {
            System.out.print(employee.getCountry() + " ");
        }
        Collections.sort(employees);
        System.out.println();
        for (Employee employee : employees) {
            System.out.print(employee.getCountry() + " ");
        }
    }
    @Test
    @DisplayName("The map of number of employee per country")
    void testEmployeePerCountry() {
        Map<String,Integer> expectedEmployeePerCountry=new HashMap<>();
        expectedEmployeePerCountry.put("Romania",3);
        expectedEmployeePerCountry.put("country1",2);
        expectedEmployeePerCountry.put("country2",1);
        System.out.println(expectedEmployeePerCountry);
        Map<String,Integer> employeePerCountry=company.createEmployeePerCountry();
        System.out.println(employeePerCountry);

    }
}
