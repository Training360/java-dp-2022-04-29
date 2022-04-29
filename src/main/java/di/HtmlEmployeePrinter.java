package di;

public class HtmlEmployeePrinter implements EmployeePrinter {

    @Override
    public String print(Employee employee) {
            return "<html><body><h1>" + employee.getName() + "<br />" + employee.getYearOfBirth() + "</h1></body></html>";
    }
}
