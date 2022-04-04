package model;

import java.time.LocalDate;

public class NewsArticle
{
    String title;
    String body;
    boolean online;
    LocalDate postedOn;
    int views;

    public NewsArticle(String title, String body, boolean online, LocalDate postedOn,
                       int views)
    {
        title = title;
        body = body;
        online = online;
        postedOn = postedOn;
        views = views;
    }

    public String title()
    {
        return title;
    }

    public String body()
    {
        return body;
    }

    public boolean online()
    {
        return online;
    }

    public LocalDate postedOn()
    {
        return postedOn;
    }
}
