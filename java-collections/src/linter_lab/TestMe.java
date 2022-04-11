package linter_lab;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TestMe
{
    public static void main(String[] args)
    {
        //new way (try-with-resources)
        try(PrintWriter writer = new PrintWriter(new FileOutputStream("my_file.txt")))
        {
            //use the writer...
            System.out.println(writer);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
