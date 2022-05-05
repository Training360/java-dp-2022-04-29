package decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John Doe");
        names.add("Jack Doe");

        names = Collections.unmodifiableList(names);
        names.add("Jane Doe");

    }
}
