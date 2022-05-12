package memento;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;

    private int yearOfBirth;

    private List<Employee> versions = new ArrayList<>();

    public void changeName(String name) {
        versions.add(new Employee(this));
        this.name = name;
    }

    public Employee(Employee employee) {
        this.name = employee.name;
        this.yearOfBirth = employee.yearOfBirth;
    }
}
