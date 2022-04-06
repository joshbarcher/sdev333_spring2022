package driver;

import structures.Bag;

public class BagTest
{
    public static void main(String[] args)
    {
        Bag bagOfColors = new Bag(5);
        System.out.println("Empty? " + bagOfColors.isEmpty());

        bagOfColors.add("red");
        bagOfColors.add("green");
        bagOfColors.add("yellow");
        /*bagOfColors.add("blue");
        bagOfColors.add("purple");
        bagOfColors.add("beige");*/

        System.out.println(bagOfColors);
        System.out.println("Size: " + bagOfColors.size());
        System.out.println("Capacity: " + bagOfColors.capacity());
        System.out.println("Empty? " + bagOfColors.isEmpty());

        try
        {
            Bag badBag = new Bag(-2);
            System.out.println("Bag is not working");
        }
        catch (IllegalStateException ex)
        {
            System.out.println("Bag is working");
        }

        //create a bag of 1,000,000 numbers
        Bag bagOfNumbers = new Bag(1000000);

        System.out.println("Started adding numbers");
        for (int i = 1; i <= 1000000; i++)
        {
            bagOfNumbers.add(i);
        }
        System.out.println("Ended adding numbers");
        System.out.println("Size: " + bagOfNumbers.size());
    }
}
