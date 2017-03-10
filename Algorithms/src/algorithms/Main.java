/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Tobias
 */
public class Main
{
    public static void main(String[] args)
    {
        int n = 200000;
        Integer[] array = new Integer[n];
        Random rnd = new Random();
        for(int i = 0; i < n; ++i)
        {
            array[i]=rnd.nextInt(100)+1;
        }
        SortingAlgorithm sortAlg = new SelectionSort();
        long startTime = System.nanoTime();
        sortAlg.sort(array, Comparator.naturalOrder());
        long runTime = System.nanoTime() - startTime;
        for(int i = 0; i < array.length; ++i)
        {
            System.out.println(i + ": " + array[i]);
        }
        System.out.println("Time: " + runTime);
    }
    
    /*
    public static void selectionSort(int[] intArray)
    {
        for(int i = 0; i < intArray.length-1; ++i)
        {
            int best = i;
            for(int j = i + 1; j < intArray.length; ++j)
            {
                if(intArray[j] < intArray[best])
                {
                    best = j;
                }
            }
            int tmp = intArray[i];
            intArray[i] = intArray[best];
            intArray[best] = tmp;
        }
    }
*/
    
}
