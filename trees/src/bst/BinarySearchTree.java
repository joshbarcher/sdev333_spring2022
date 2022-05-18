package bst;

public class BinarySearchTree<T extends Comparable<T>> implements ITree<T>
{
    //fields...
    private Node root;
    private int size = 0;

    @Override
    public void add(T... elements)
    {
        for (T element : elements)
        {
            add(element);
        }
    }

    @Override
    public boolean add(T element)
    {
        //start searching at the root for a place to
        //add the input parameter
        int savedSize = size;
        root = add(root, element);
        return savedSize != size; //make sense?
    }

    //add() is supported by a private recursive method
    private Node add(Node current, T element)
    {
        //base case (we found a null reference, a place to
        //put our new node)
        if (current == null)
        {
            size++;
            return new Node(element);
        }

        //use the comparable interface to compare the current
        //node to the inserted element
        int compare = current.data.compareTo(element);
        if (compare < 0) //search to the right
        {
            current.right = add(current.right, element);
        }
        else if (compare > 0) //search to the left
        {
            current.left = add(current.left, element);
        }

        //return the current node
        return current;
    }

    @Override
    public boolean contains(T element)
    {
        return false;
    }

    @Override
    public boolean remove(T element)
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
    public void clear()
    {

    }

    private class Node
    {
        private T data;
        private Node left;
        private Node right;

        public Node(T data)
        {
            this.data = data;
        }

        public Node(T data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString()
        {
            String leftChild = (left == null) ? "null" : left.data.toString();
            String rightChild = (right == null) ? "null" : right.data.toString();

            return leftChild + " <-- " + data.toString() + " --> " + rightChild;
        }
    }
}
