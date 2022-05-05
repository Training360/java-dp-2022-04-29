package builder;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBuilder {

    private String name = "Anonymous";

    private int yearOfBirth;

    private int salary;

    private List<Skill> skills = new ArrayList<>();

    public EmployeeBuilder withName(String name) {
        if (name == null ||name.isBlank()) {
            throw new IllegalArgumentException("Nem lehet üres");
        }
        this.name = name;
        return this;
    }

    public EmployeeBuilder withBaseData(String name, int salary) {
        this.name = name;
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder withSalary(String salary) {
        this.salary = Integer.parseInt(salary);
        return this;
    }

    public EmployeeBuilder withSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder increaseSalary(int diff) {
        this.salary = this.salary + diff;
        return this;
    }

    public EmployeeBuilder withSkill(String name, int level) {
        skills.add(new Skill(name, level));
        return this;
    }

    public Employee build() {
        var employee = new Employee();
        employee.setName(name);
        employee.setYearOfBirth(yearOfBirth);
        employee.setSalary(salary);
        employee.setSkills(skills);
        return employee;
    }

}
