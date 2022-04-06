package structures;

import java.util.Arrays;

public class Bag implements ICollection
{
    //store our elements in an array
    private Object[] data;
    private int nextIndex = 0;

    public Bag(int capacity)
    {
        //precondition(s)
        if (capacity < 0) {
            throw new IllegalStateException("Capacity must be non-negative");
        }

        data = new Object[capacity];
    }

    @Override
    public boolean add(Object element)
    {
        //is the bag full?
        if (nextIndex == data.length) {
            return false;
        }

        data[nextIndex] = element;
        nextIndex++;
        return true;

        /*for (int i = 0; i < data.length; i++)
        {
            //is there a spot that is open?
            if (data[i] == null)
            {
                data[i] = element;
                return true;
            }
        }
        return false;*/
    }

    @Override
    public int size()
    {
        return nextIndex;
    }

    public int capacity()
    {
        return data.length;
    }

    @Override
    public boolean isEmpty()
    {
        //return nextIndex == 0;
        //return size() == 0;
        return data[0] == null;
    }

    @Override
    public boolean contains(Object element)
    {
        return false;
    }

    @Override
    public boolean remove(Object element)
    {
        return false;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public String toString()
    {
        return "Bag: " + Arrays.toString(data);
    }
}
