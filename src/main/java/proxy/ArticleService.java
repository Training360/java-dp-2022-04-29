package proxy;

public interface ArticleService {

    String readArticle(long id);

    long createArticle(String text);
}
