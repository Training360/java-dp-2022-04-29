package adaptermenu;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DefaultMenuItem implements MenuItem {

    private String name;

    @Override
    public String getTitle() {
        return name;
    }
}
