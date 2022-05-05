package adaptermenu;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CategoryMenuItemAdapter implements MenuItem {

    private Category category;

    @Override
    public String getTitle() {
        return category.getName();
    }
}
