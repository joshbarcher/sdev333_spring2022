package hashing;

import java.util.Iterator;

public class HashTable<T> implements IHashTable<T>
{
    public static final int INITIAL_TABLE_SIZE = 10;
    public static final int RESIZE_RATE = 2;
    public static final double MAX_LOAD_FACTOR = 0.5;

    private ElementWrapper[] table;
    private int size;

    public HashTable()
    {
        table = new ElementWrapper[INITIAL_TABLE_SIZE];
    }

    @Override
    public boolean add(T element)
    {
        //is the table too full? (have we exceeded the load factor)
        double curLoadFactor = (double)size / table.length;
        if (curLoadFactor > MAX_LOAD_FACTOR)
        {
            resize();
        }

        //no duplicates in a hash table (this is a set structure!)
        if (contains(element))
        {
            return false; //exit
        }

        //get a positive hash code and index
        int code = Math.abs(element.hashCode());
        int index = code % table.length;

        //insert the element
        //use probing (linear) to search for a spot in the table
        while (table[index] != null)
        {
            index = (index + 1) % table.length;
        }

        table[index] = new ElementWrapper(element);
        size++;

        return true;
    }

    private void resize()
    {
        //TODO write this later
    }

    @Override
    public void add(T... elements)
    {

    }

    @Override
    public boolean contains(T element)
    {
        return false;
    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public boolean remove(T element)
    {
        return false;
    }

    @Override
    public Iterator<T> iterator()
    {
        return null;
    }

    @Override
    public T get(T element)
    {
        return null;
    }

    @Override
    public String toString()
    {
        return null;
    }

    private static class ElementWrapper<T>
    {
        private T element;
        private boolean removed;

        public ElementWrapper(T element)
        {
            this.element = element;
            removed = false;
        }

        public ElementWrapper(T element, boolean removed)
        {
            this.element = element;
            this.removed = removed;
        }
    }
}