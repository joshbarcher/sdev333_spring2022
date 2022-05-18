package driver;

import bst.BinarySearchTree;

public class TestBST
{
    public static void main(String[] args)
    {
        BinarySearchTree<Integer> numTree = new BinarySearchTree<>();

        numTree.add(42, 10, 55, 48, 41, 40, 55, 56, 72, 87);
    }
}
