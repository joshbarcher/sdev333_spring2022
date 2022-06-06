package search;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Stores a dictionary that provides definitions given a word
 * or partial matching for words in the dictionary.
 *
 * @author ???
 * @version 1.0
 */
public class DictionarySearch implements IDictionary
{
    private Tree wordTree;
    private Map<String, String> definitions;

    /**
     * Creates a new search object with a dictionary loaded and
     * ready for searching.
     */
    public DictionarySearch()
    {
        wordTree = new Tree();

        //open one of the test files

        //read each line of the file

        //enter the word into the tree
        //enter the word/definition into the map
    }

    @Override
    public String getDefinition(String word)
    {
        //use the map!
        return null;
    }

    @Override
    public String[] getPartialMatches(String search)
    {
        return null;
    }
}
