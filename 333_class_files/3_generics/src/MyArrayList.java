import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T>
{
    public void add(T element)
    {

    }

    /**
     *
     * @param element
     */
    public void add(T... element)
    {

    }

    @Override
    public Iterator<T> iterator()
    {
        return null;
    }

    public static void main(String[] args)
    {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("a", "b", "c", "d");
    }
}
