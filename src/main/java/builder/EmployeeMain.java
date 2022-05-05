package builder;

import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
//        var e = new Employee();
//        e.setSkills(List.of(new Skill("Java", 5)));

        var employee =
                new EmployeeBuilder()
//                        .withName("   ")
//                        .withSalary("100000")
                        .withBaseData("John Doe", 100_000)
                        .increaseSalary(100)
                        .increaseSalary(100)
                        .withSkill("Java", 1)
                        .build();

//        Employee.builder().name("John Doe").salary(100).build();
    }
}
