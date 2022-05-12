package iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class IteratorMain {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>(List.of("John Doe", "Jack Doe", "Jane Doe"));
//        List<String> names = new LinkedList<>((List.of("John Doe", "Jack Doe", "Jane Doe"));

        Set<String> names = Set.of("John Doe", "Jack Doe");

        var iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
