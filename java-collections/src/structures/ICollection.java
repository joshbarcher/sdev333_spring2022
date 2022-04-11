package structures;

/**
 * This represents any type of data structure
 * that stores elements.
 *
 * @author Josh
 * @version 1.0
 */
public interface ICollection
{
    /**
     * Adds a new object to the collection
     * @param element the new object to add
     * @return true if the element was added, otherwise false
     */
    boolean add(Object element);

    /**
     * Reports whether an element is found in the collection
     * @param element the element to search for
     * @return true if the element was found, otherwise false
     */
    boolean contains(Object element);

    /**
     * Removes the first occurrence of the input parameter
     * @param element the element to find and remove
     * @return true if the element was found and removed, otherwise false
     */
    boolean remove(Object element);

    /**
     * Returns the number of elements in the collection
     * @return the number of elements
     */
    int size();

    /**
     * Reports whether the collection is empty
     * @return true if empty, otherwise false
     */
    boolean isEmpty();

    /**
     * Removes all elements in the collection
     */
    void clear();
}
