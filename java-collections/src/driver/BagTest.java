package driver;

import structures.Bag;

public class BagTest
{
    public static void main(String[] args)
    {
        Bag bagOfColors = new Bag(5);

        bagOfColors.add("red");
        bagOfColors.add("green");
        bagOfColors.add("yellow");
        bagOfColors.add("blue");
        bagOfColors.add("purple");
        bagOfColors.add("beige");

        System.out.println(bagOfColors);

        try
        {
            Bag badBag = new Bag(-2);
            System.out.println("Bag is not working");
        }
        catch (IllegalStateException ex)
        {
            System.out.println("Bag is working");
        }
    }
}
