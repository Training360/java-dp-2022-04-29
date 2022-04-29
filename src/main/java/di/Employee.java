package di;

public class Employee {

    private String name;

    private int yearOfBirth;

    private EmployeePrinter employeePrinter;

    public Employee(String name, int yearOfBirth, EmployeePrinter employeePrinter) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.employeePrinter = employeePrinter;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String print() {

        return employeePrinter.print(this);
    }

    public void setEmployeePrinter(EmployeePrinter employeePrinter) {
        this.employeePrinter = employeePrinter;
    }
}
