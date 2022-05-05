package files;

import java.nio.file.Path;

public class FilesMain {

    public static void main(String[] args) {
        var path = Path.of("\\Users\\file.txt");
        System.out.println(path);
        System.out.println(path.getClass().getName());
    }
}
