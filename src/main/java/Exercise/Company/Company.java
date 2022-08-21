package Exercise.Company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public List<Employee> overFifty() {
        List<Employee> employeeOverFifty = new ArrayList<>();
        for (Employee employee : this.employees) {
            if (employee.getAge() >= 50) {//>= not >
                employeeOverFifty.add(employee);
            }
        }
        return employeeOverFifty;
    }

    public List<Employee> fromTheSameCountry(String country) {
        List<Employee> fromTheSameCountry = new ArrayList<>();
        for (Employee employee : this.employees) {
            if (employee.getCountry().equals(country)) {
                fromTheSameCountry.add(employee);
            }
        }
        return fromTheSameCountry;
    }

    public void sortByName() {
        //todo metoda testul este inceput

    }

    public Map<String, Integer> createEmployeePerCountry() {
        Map<String, Integer> employeePerCountry = new HashMap<>();

        for (Employee employee : this.employees) {
            if (!employeePerCountry.containsKey(employee.getCountry())) {
                employeePerCountry.put(employee.getCountry(), 1);
            } else {
                int newNumberOfEmployeesPerCountry = employeePerCountry.get(employee.getCountry()) + 1;
                employeePerCountry.replace(employee.getCountry(), newNumberOfEmployeesPerCountry);
            }
        }

        return employeePerCountry;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
