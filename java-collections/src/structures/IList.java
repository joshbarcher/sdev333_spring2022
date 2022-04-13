package structures;

import java.util.Set;

/**
 * This represents any list structure.
 * An IList is also an ICollection, where
 * the list adds the concept of positions
 * to elements.
 *
 *
 */
public interface IList extends ICollection
{
    Object get(int index);
    void set(int index, Object element);
    boolean add(int index, Object element); //"insert" operation
}
