/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Opg2
{
   public static void main(String[] args)
    {
        Opg2 o = new Opg2();
        int[] arr =
        {
            2, 5, 2, 9, 7, 1, 2, 3, 5, 9, 1, 2, 6, 5, 110
        };
        o.countNumbersNew(arr);
    }
   
   // Count number of occurrences of each number in the array
    public void countNumbersNew(int[] arr)
    {
        //-- Use a TreeMap to store a counter value for each number(key)
        // A sorted set of the numbers (keys) is then directly available
        // key = the integer value in array       
        // value = "counter"
        TreeMap<Integer, Integer> tm = new TreeMap();
        for (int i = 0; i < arr.length; i++)
        {
            if (tm.containsKey(arr[i]))
            {
                tm.put(arr[i], tm.get(arr[i]) + 1);
            } else
            {
                tm.put(arr[i], 1);
            }
        }
        //-- Traverse using a set of keys (the numbers) in ascending order
        Set navSet = tm.navigableKeySet();
        System.out.println("Elements : Number of occurrences");

        Iterator it = navSet.iterator();
        while (it.hasNext())
        {
            Integer element = (int) it.next();
            System.out.println(element + " : " + tm.get(element));
        }
    }

 

}
