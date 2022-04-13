package boxing;

import java.util.ArrayList;

public class Example
{
    public static void main(String[] args)
    {
        ArrayList<Character> listOfCharacters = new ArrayList<Character>();

        listOfCharacters.add('a'); //'a' is converted to a Character object storing 'a'
        char first = listOfCharacters.get(0);

        System.out.println(first);
    }
}
