package bst;

public interface ITree<T extends Comparable<T>>
{
    //basic methods
    void add(T... elements); //insert all input parameters
    boolean add(T element);
    boolean contains(T element);
    boolean remove(T element);
    int size();
    boolean isEmpty();
    void clear();
}
