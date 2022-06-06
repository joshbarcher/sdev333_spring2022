package search;

/**
 * This interface defines the basic functionality needed
 * for the DictionarySearchGUI to work correctly.
 *
 * DO NOT ALTER THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public interface IDictionary
{
    /**
     * Looks up a word in the dictionary and returns the definition of the
     * word. A null value is returned if the word is not found in the
     * dictionary.
     *
     * @param word the word to search for
     * @return the definition of the word, or null if it is not found
     */
    String getDefinition(String word);

    /**
     * Searches for search matches in the dictionary and returns them in
     * an array.
     *
     * @param search the string to search for
     * @return an array of partial matches, or a string array of length
     * zero if no matches are found
     */
    String[] getPartialMatches(String search);
}
