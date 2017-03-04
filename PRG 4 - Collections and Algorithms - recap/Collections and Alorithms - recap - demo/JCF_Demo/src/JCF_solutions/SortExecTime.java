
package JCF_solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Henrik
 */
public class SortExecTime
{
    public static void main(String[] args)
    {
          //== create and fill lists  ===============================================
        
        int n = 1_000_000;          // "problem size"  
        Random ran = new Random();
        
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < n; i++)
            arrayList.add(ran.nextInt(n*10));
        
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < n; i++)
        {
            linkedList.add(ran.nextInt(n*10));
        }
        
        
        //-- measure time
        long startTimeA = System.nanoTime();
        Collections.sort(arrayList);
        long executionTimeA = System.nanoTime() - startTimeA;
        
        long startTimeL = System.nanoTime();
        Collections.sort(linkedList);
        long executionTimeL = System.nanoTime() - startTimeL;
        //-----------------
        
        System.out.println("Execution time ArrayList  (micro sec): " + executionTimeA/1000);
        System.out.println("Execution time LinkedList (micro sec): " + executionTimeL/1000);
    }
    
}
