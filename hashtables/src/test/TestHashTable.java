package test;

import hashing.HashTable;

public class TestHashTable
{
    public static void main(String[] args)
    {
        HashTable<String> wordTable = new HashTable<>();

        wordTable.add("apple");
        wordTable.add("grape");
        wordTable.add("banana");
        wordTable.add("cantalope");
        wordTable.add("raisin");
        wordTable.add("kiwi");
        wordTable.add("mango");

        System.out.println(wordTable);
    }
}
