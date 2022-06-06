package hashing;

import java.util.Iterator;

public class HashTable<T> implements IHashTable<T>
{
    private Element[] table;

    public HashTable()
    {
        table = new Element[10];
    }

    @Override
    public void add(T... elements)
    {

    }

    @Override
    public boolean add(T element)
    {

        return true;
    }

    private void resize()
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

    private static class Element<T>
    {
        private T element;
        private boolean removed;

        public Element(T element, boolean removed)
        {
            this.element = element;
            this.removed = removed;
        }
    }
}