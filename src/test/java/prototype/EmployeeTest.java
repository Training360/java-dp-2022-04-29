package prototype;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testClone() {
        var typicalEmployee = new Employee("Anonymous",
                1980,
                100_000,
                List.of(new Skill("Varrás", 5)));

        var copy = new Employee(typicalEmployee);

//        assertFalse(typicalEmployee.getSkills() == copy.getSkills());
//        assertNotSame(typicalEmployee.getSkills(), copy.getSkills());
        assertThat(typicalEmployee.getSkills()).isNotSameAs(copy.getSkills());
    }
}
