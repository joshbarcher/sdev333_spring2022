package structures;

import java.util.Arrays;
import java.util.Random;

public class Bag<T> implements ICollection<T>
{
    //store our elements in an array
    private T[] data;
    private int nextIndex = 0;

    public Bag(int capacity)
    {
        //precondition(s)
        if (capacity < 0) {
            throw new IllegalStateException("Capacity must be non-negative");
        }

        //workaround is to create an object array and cast it
        //to a generic array (due to "type erasure")
        data = (T[]) new Object[capacity];
    }

    @Override
    public boolean add(T element)
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
    public boolean contains(T element)
    {
        for (int i = 0; i < nextIndex; i++)
        {
            if (data[i].equals(element)) //this will compare memory addresses of the objects
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public T random()
    {
        if (isEmpty())
        {
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(size());
        return data[randomIndex];
    }

    @Override
    public boolean remove(T element)
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
