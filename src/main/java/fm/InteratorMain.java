package fm;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

public class InteratorMain {

    public static void main(String[] args) {

        Iterable<String> i1 = List.of("a", "b", "c");
        Iterable<String> i2 = new ArrayDeque<>();

        Iterator<String> iterator = i2.iterator();
        System.out.println(iterator.getClass().getName());
        while (iterator.hasNext()) {
            String s = iterator.next();
        }

    }
}
