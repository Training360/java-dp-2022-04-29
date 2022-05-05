package adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeePrintableAdapter implements Printable {

    private Employee employee;

    @Override
    public String getContent() {
        return employee.getName();
    }
}
