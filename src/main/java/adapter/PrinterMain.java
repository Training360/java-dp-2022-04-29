package adapter;

public class PrinterMain {

    public static void main(String[] args) {
        var printer = new Printer();
        var employee = new Employee("John Doe");
        printer.print(new EmployeePrintableAdapter(employee));
    }
}
