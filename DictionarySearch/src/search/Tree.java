package search;

import java.util.Arrays;
import java.util.List;

public class Tree
{
    private Node root = new Node('-');

    public void add(String word)
    {
        //do something...
        add(root, word);
    }

    private void add(Node current, String partOfWord)
    {
        //base case
        if (partOfWord.length() == 0)
        {

        }
        else
        {
            //add a new node with the first character of partOfWord
            char first = partOfWord.charAt(0);
            //... adding node

            //then recurse with a shorter string
            String remainingWord = partOfWord.substring(1);
            //... recursive call
        }
    }

    public List<String> findMatches(String partial)
    {
        return null;
    }

    private class Node
    {
        private char character;
        private Node[] children = new Node[26];
        private boolean isWordEnd;
        private boolean isLeaf;

        public Node(char character)
        {
            this.character = character;
        }

        @Override
        public String toString()
        {
            String arrayString = "[";

            //loop over all child nodes
            for (int i = 0; i < children.length; i++)
            {
                if (children[i] != null)
                {
                    arrayString += String.valueOf(children[i].character) + ", ";
                }

                //add "null, " or "char, " to the array string
                /*String nodeString = children[i] == null ? "null, " :
                        String.valueOf(children[i].character) + ", ";
                arrayString += nodeString;*/
            }

            arrayString += "]";

            return "Node: " + character + " " + arrayString;
        }
    }
}
