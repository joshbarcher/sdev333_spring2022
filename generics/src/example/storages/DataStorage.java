package example.storages;

public class DataStorage<T>
{
    private T data;

    public DataStorage(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }
}
