package di;

public class EmployeeMain {

    public static void main(String[] args) {
//        EmployeePrinter employeePrinter = new HtmlEmployeePrinter("csv");
//        var employeePrinter = new CsvEmployeePrinter();
        var employeePrinter = new JsonEmployeePrinter();
        Employee e = new Employee("John Doe", 1980, employeePrinter);
        System.out.println(e.print());

        e.setEmployeePrinter(new HtmlEmployeePrinter());

        System.out.println(e.print());

        e.setEmployeePrinter(emp -> emp.getName());
        System.out.println(e.print());

    }
}
