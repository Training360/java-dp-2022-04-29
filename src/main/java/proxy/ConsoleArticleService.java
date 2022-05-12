package proxy;

public class ConsoleArticleService implements ArticleService {

    @Override
    public String readArticle(long id) {
        System.out.println("Read article by id");
        return null;
    }

    @Override
    @Secured(Role.WRITE)
    public long createArticle(String text) {
        System.out.println("Create article");
        return 0;
    }
}
