/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Tobias
 */
public class Algorithms
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        long n = 2000000000;
        long start1 = System.nanoTime();
        long res1 = addUp(n);
        long time1 = System.nanoTime() - start1;
        long start2 = System.nanoTime();
        long res2 = addUp2(n);
        long time2 = System.nanoTime() - start2;
        System.out.println("Result 1: " + res1);
        System.out.println("Time 1: " + time1);
        System.out.println("Result 2: " + res2);
        System.out.println("Time 2: " + time2);
        
    }
    
    
    public static long addUp(long n)
    {
        long res = 0;
        for(long i = 1; i <= n; ++i)
        {
           res += i;
        }
        return res;
    }
    
    public static long addUp2(long n)
    {
        return (n*(n+1))/2;
    }
    
    public static long foo(long n)
    {
        long res = 0;
        while(n > 1)
        {
            res += n;
            n = n / 2;
        }
        return res;
    }
    
}
