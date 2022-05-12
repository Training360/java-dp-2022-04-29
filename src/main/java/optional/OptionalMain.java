package optional;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        String name = null;
        name = "John Doe";

        Optional<String> nameMayBeEmpty = Optional.empty();
        nameMayBeEmpty = Optional.of("John Doe");

        if (nameMayBeEmpty.isEmpty()) {
            System.out.println("Üres");
        }
        else {
            System.out.println(nameMayBeEmpty.get());
        }
    }
}
