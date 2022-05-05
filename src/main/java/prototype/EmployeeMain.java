package prototype;

import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee typicalEmployee = new Employee("Anonymous",
                1980,
                100_000,
                List.of(new Skill("Varrás", 5)));

        Employee newEmployee = new Employee(typicalEmployee);

        newEmployee.setName("John Doe");

        System.out.println(typicalEmployee);
        System.out.println(newEmployee);

        newEmployee.getSkills().add(new Skill("Horgolás",3));
        System.out.println(typicalEmployee);
        System.out.println(newEmployee);

        newEmployee.getSkills().get(0).setLevel(6);

        System.out.println(typicalEmployee);
        System.out.println(newEmployee);
    }
}
