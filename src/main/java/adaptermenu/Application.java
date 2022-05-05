package adaptermenu;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        var categories = List.of(
                new Category("Monitorok"),
                new Category("Gépházak"),
                new Category("Billentyűzetek"),
                new Category("Egérek")
        );

        var menuItems = categories
                .stream()
                .map(c -> new CategoryMenuItemAdapter(c))
                .toList();

//        var menuItems = categories
//                .stream()
//                .map(c -> new DefaultMenuItem(c.getName()))
//                .toList();

        new MenuDisplay().print(menuItems);

        categories.get(3).setName("Egerek");
        new MenuDisplay().print(menuItems);
    }
}
