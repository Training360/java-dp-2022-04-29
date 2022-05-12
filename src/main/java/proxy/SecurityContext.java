package proxy;

import java.util.ArrayList;
import java.util.List;

public class SecurityContext {

    private List<Role> roles = new ArrayList<>();

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

    public void addRole(Role role) {
        roles.add(role);
    }
}
