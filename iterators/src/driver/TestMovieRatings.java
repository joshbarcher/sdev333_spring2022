package driver;

import model.MovieRating;

public class TestMovieRatings
{
    public static void main(String[] args)
    {
        MovieRating myRating = new MovieRating("The Batman", "Josh Archer",
                                               5, false);

        for (Object part : myRating)
        {
            System.out.println(part);
        }
    }
}
