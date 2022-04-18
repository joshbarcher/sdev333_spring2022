package gardens;

public class TestPlants
{
    public static void main(String[] args)
    {
        Garden<? extends Rose> roseGarden = new Garden<Rose>(new Rose("red"));

    }
}
