package hashing;

public interface IHashTable<T> extends Iterable<T>
{
    void add(T... elements);
    boolean add(T element);
    boolean remove(T element);
    boolean contains(T element);
    int size();
    boolean isEmpty();
    T get(T element); /* find an equivalent object in the table */
}
