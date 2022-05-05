package di;

public class JsonEmployeePrinter implements EmployeePrinter {

    @Override
    public String print(Employee employee) {
        return """
                {
                    "name": ${name},
                    "yearOfBirth" ${year} 
                }
                """.replace("${name}", employee.getName())
                .replace("${year}", Integer.toString(employee.getYearOfBirth()));
    }

    @Override
    public String getType() {
        return "json";
    }
}
