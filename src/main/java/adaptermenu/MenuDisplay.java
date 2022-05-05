package adaptermenu;

import java.util.List;

public class MenuDisplay {

    public void print(List<? extends MenuItem> menuItems) {
        for (var item: menuItems) {
            System.out.println(item.getTitle());
        }
    }
}
