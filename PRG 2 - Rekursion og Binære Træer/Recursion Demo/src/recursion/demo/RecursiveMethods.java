package recursion.demo;

// Show simple recursive implementations
// hau
public class RecursiveMethods
{

    //--  add all numbers from 1 to t - use iteration
    public int sumIter(int t)
    {
        int res = 0;
        for (int i = 0; i <= t; i++)
        {
            res += i;
        }
        return res;
    }

    //--  add all numbers from 1 to t - use recursion 
    public int sumRec(int t)
    {
        if (t == 1)
        {
            return t;                   //base case
        } else
        {
            return (t + sumRec(t - 1)); // recursive call 
        }
    }

    //==============================================
    //--  calculate the factorial of n  (n!) - use recursion
    //    public int factorial(int n)
    //    insert code here ....
    //=========================================
    public int multIter(int m, int n)
    {
        int res = 0;
        for (int i = 1; i <= n; i++)
        {
            res += m;
        }
        return res;
    }

    //--  calculate the product of two numbers - use recursion
    //    insert code here ...
    
    public int mult(int m, int n)
    {
       if(m==1)
           return n;           // base
       else
           return  n + mult(m-1,n);  // rekursivt kald    
                   
    }
    
    public int factRec(int n)
    {
        if(n==1)                        // base case
            return 1;
        else
            return n * factRec(n-1);   // rekursivt kald
    }
    
    
    
    
    
    //=========================================
    public boolean palindrome(String word)
    {
        if(word.length() <= 1)            // base case
            return true;
        else
            return ( word.charAt(0) == word.charAt(word.length()-1) &&
                    palindrome(word.substring(1, word.length()-1)     ) );                // rekursivt kald
    }
    
    
    
    //=========================================
    // Extra
    // beregn det n´te tal i Fibonacci´s talfølge
//    public int fibonacci (int n)
//      insert code here ..
    
    
    
    
    public static void main(String args[])
    {
        RecursiveMethods d = new RecursiveMethods();

//        System.out.println(d.sumIter(10));
//        System.out.println(d.sumRec(10));
//        System.out.println(d.factRec(30));
//        System.out.println("2*6 = " + d.multIter(2,6));
//        System.out.println("2*6 = " + d.mult(2,6));	    
        System.out.println(d.palindrome("regninger"));
//        System.out.println("Fibonacci 7: " + d.fibonacci(7));
    }
}
