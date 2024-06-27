import java.util.*;
public class nthFibonacciUsingRecursion
{
    public static void main(String args[])
    {
        System.out.println(findFibo(7));
    }
    public static int findFibo(int N)
    {
        if(N < 2)
            return N;
        return findFibo(N - 1) + findFibo(N - 2);
    }
}
