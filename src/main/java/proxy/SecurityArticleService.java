package proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityArticleService implements ArticleService {

    private ArticleService articleService;

    private SecurityContext securityContext;

    @Override
    public String readArticle(long id) {
        return articleService.readArticle(id);
    }

    @Override
    public long createArticle(String text) {
        // "Controll access to it"
        if (hasNotRole(Role.WRITE)) {
            throw new SecurityException("Has not role: WRITE");
        }
        return articleService.createArticle(text);
    }

    boolean hasNotRole(Role role) {
        return !securityContext.hasRole(role);
    }
}
