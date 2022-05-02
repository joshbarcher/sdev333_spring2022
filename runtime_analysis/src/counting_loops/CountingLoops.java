package counting_loops;

public class CountingLoops
{
    public static void main(String[] args)
    {
        CountingLoops loops = new CountingLoops();
        loops.foo11(10000000);
    }

    public void foo(int n)
    {
        //looping from 1 to n
        for (int i = 1; i <= n; i++) //this is linear
        {
            System.out.println(n);
        }
    }

    public void foo(String[] words)
    {
        //looping from 0 to (n-1)
        for (int i = 0; i < words.length; i++) //this is linear
        {
            System.out.println(words[i]);
        }
    }

    public void foo2(int n)
    {
        //with nested loops you multiply - n * n = n^2
        for (int i = 1; i <= n; i++) //this is n
        {
            for (int j = 1; j <= n; j++) //this is n
            {
                System.out.println(i * j);
            }
        }
    }

    public void foo3(int n)
    {
        //with nested loops you multiply - n * n * n = n^3
        for (int i = 1; i <= n; i++) //this is n
        {
            for (int j = 1; j <= n; j++) //this is n
            {
                for (int k = 1; k <= n; k++) //this is n
                {
                    System.out.println(i * j * k);
                }
            }
        }
    }

    public void foo4(int n)
    {
        for (int i = 1; i <= 100; i++) //this is constant
        {
            System.out.println(n);
        }
    }

    public void foo5(int n)
    {
        //with nested loops you multiply - 10 * 10000 -> constant
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10000; j++)
            {
                System.out.println(i * j);
            }
        }
    }

    public void foo6(int n)
    {
        //with nested loops you multiply - 10000 * n -> linear
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= 10000; j++)
            {
                System.out.println(i * j);
            }
        }
    }

    public void foo7(int n)
    {
        //linear - sequential loops - n + n -> 2n -> linear runtime function
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }

        for (int j = 1; j <= n; j++)
        {
            System.out.println(j);
        }
    }

    public void foo8(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }

        for (int j = 1; j <= 100; j++)
        {
            System.out.println(j);
        }
    }

    public void foo9(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.println(i * j);
            }
        }

        for (int j = 1; j <= n; j++)
        {
            System.out.println(j);
        }
    }

    public void foo10(int n)
    {
        for (int i = 1; i <= n; i *= 2)
        {
            System.out.println(i);
        }
    }

    public void foo11(int n)
    {
        for (int i = n; i >= 1; i /= 2)
        {
            System.out.println(i);
        }
    }
}

