package proxy;

public class ArticleMain {

    public static void main(String[] args) {
        var context = new SecurityContext();
        context.addRole(Role.WRITE);
        ArticleService articleService =
                new SecurityArticleService(new ConsoleArticleService(),
                        context);

//        SecurityContext.getInstance().addRole(Role.WRITE);

        articleService.createArticle("Hello");
    }
}
