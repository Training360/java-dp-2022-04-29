package di;

public class CsvEmployeePrinter implements EmployeePrinter{

    @Override
    public String print(Employee employee) {
        return employee.getName() + "," + employee.getYearOfBirth();
    }

    @Override
    public String getType() {
        return "csv";
    }
}
