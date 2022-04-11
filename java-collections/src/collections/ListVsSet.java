package collections;

import java.util.*;

public class ListVsSet
{
    public static void main(String[] args)
    {
        //create a list
        Collection<Integer> listOfNums = new LinkedList<Integer>();

        //add some elements to the list
        for (int i = 33; i <= 99; i++)
        {
            listOfNums.add(i);
        }

        System.out.println("Size: " + listOfNums.size());
        System.out.println("contains(10)? " + listOfNums.contains(10));

        //loop over all elements and print them out
        for (int num : listOfNums)
        {
            System.out.println(num);
        }

        //do hash tables keep elements in sorted order?
        Set<String> setOfWords = new TreeSet<>();

        setOfWords.add("rudimentary");
        setOfWords.add("archipelego");
        setOfWords.add("aesthetic");
        setOfWords.add("amiable");
        setOfWords.add("parabelleum");
        setOfWords.add("oxyphenbutazone");

        System.out.println(); //new line
        for (String word : setOfWords)
        {
            System.out.println(word);
        }

        System.out.println(); //new line
        for (String word : setOfWords)
        {
            System.out.println(word);
        }
    }
}











