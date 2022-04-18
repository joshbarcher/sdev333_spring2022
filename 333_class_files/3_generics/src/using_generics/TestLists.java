package using_generics;

import gardens.Rose;

public class TestLists
{
    public static void main(String[] args)
    {
        TodoList todoList = new TodoList();
        todoList.add("Wash the car");

        //yikes!
        //TodoList<Rose> roses = new TodoList<>();
    }
}
