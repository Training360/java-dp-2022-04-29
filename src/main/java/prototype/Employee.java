package prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String name;

    private int yearOfBirth;

    private int salary;

    private List<Skill> skills = new ArrayList<>();

//    public Employee(String name, int salary) {
//        this.name = name;
//        this.salary = salary;
//    }

    public static Employee createEmployeeWithSalary(String name, int salary) {
        return null;
    }

    public static Employee createEmployeeWithYearOfBirth(String name, int yearOfBirth) {
        return null;
    }

    public static Employee createAnonymous() {
        return new Employee();
    }

//    public static Employee copyOf(Employee employee) {
//
//    }

//    public Employee copyOf() {
//
//    }


    public Employee(Employee another) {
        this.name = another.name;
        this.yearOfBirth = another.yearOfBirth;
        this.salary = another.salary;
        this.skills = new ArrayList<>(another.skills.stream().map(
                s-> new Skill(s)
        ).toList());
    }
}
