package di;

import java.util.ArrayList;
import java.util.List;

public class PrinterSimpleFactory {

    List<EmployeePrinter> printers =
            List.of(
                    new HtmlEmployeePrinter(),
                    new CsvEmployeePrinter(),
                    new JsonEmployeePrinter()
            );

    public EmployeePrinter create(String type) {
//        for (var printer: printers) {
//            if (printer.getType().equals(type)) {
//                return printer;
//            }
//        }
//        throw new IllegalArgumentException("Not found: " + type);

        return printers.stream().filter(p -> p.getType().equals(type)).findAny().
                orElseThrow();
    }
}
