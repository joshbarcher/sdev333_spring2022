package driver;

import model.NewsArticle;

import java.time.LocalDate;

public class TestArticles
{
    public static void main(String[] args)
    {
        NewsArticle myArticle = new NewsArticle("The Sky Is Falling",
                "More rain found in Seattle", true, LocalDate.now(), 127);

        System.out.println("Created article: " + myArticle.title());
    }
}
