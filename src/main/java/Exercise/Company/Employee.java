package Exercise.Company;

public class Employee implements Comparable<Employee> {
    private String name;
    private String country;
    private Integer age;

    public Employee(String name, String country, Integer age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return String.valueOf(this.country).compareTo(otherEmployee.getCountry());
    }
}
