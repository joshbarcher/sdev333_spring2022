package model;

import java.util.Iterator;

public class MovieRating implements Iterable<Object>
{
    private String movie;
    private String username;
    private int rating; //1-5 stars
    private boolean favorite;

    public MovieRating(String movie, String username,
                       int rating, boolean favorite)
    {
        this.movie = movie;
        this.username = username;
        this.rating = rating;
        this.favorite = favorite;
    }

    public String getMovie()
    {
        return movie;
    }

    public String getUsername()
    {
        return username;
    }

    public int getRating()
    {
        return rating;
    }

    public boolean isFavorite()
    {
        return favorite;
    }

    @Override
    public String toString()
    {
        return "MovieRating{" +
                "movie='" + movie + '\'' +
                ", username='" + username + '\'' +
                ", rating=" + rating +
                ", favorite=" + favorite +
                '}';
    }

    @Override
    public Iterator<Object> iterator()
    {
        return new GatherThemUpIterator();
    }

    private class GatherThemUpIterator implements Iterator<Object>
    {
        private Object[] parts;
        private int currentPosition = 0;

        public GatherThemUpIterator()
        {
            //toss the fields into an array, we know how to write
            //an iterator with an array
            parts = new Object[] {movie, username, rating, favorite};
        }

        @Override
        public boolean hasNext()
        {
            //does currentPosition store a valid index?
            return currentPosition < parts.length;
        }

        @Override
        public Object next()
        {
            return parts[currentPosition++];
        }
    }

    //this class is responsible for handing out the data
    //in the "outer" class (MovieRating) piece-by-piece
    private class MovieRatingIterator implements Iterator<Object>
    {
        //this is the number of fields in MovieRating
        private static final int TOTAL_FIELDS = 4;

        //this is the current field being returned from MovieRating
        private int fieldCount = 0;

        @Override
        public boolean hasNext()
        {
            return fieldCount < TOTAL_FIELDS;
        }

        @Override
        public Object next()
        {
            Object result = null;
            if (fieldCount == 0) //save movie name
            {
                result = movie;
            }
            else if (fieldCount == 1) //save username
            {
                result = username;
            }
            else if (fieldCount == 2) //save rating
            {
                result = rating;
            }
            else if (fieldCount == 3) //save favorite
            {
                result = favorite;
            }

            //increment my field count and return the result
            fieldCount++;
            return result;
        }
    }
}
















