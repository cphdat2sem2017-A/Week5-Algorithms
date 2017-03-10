/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Random;

/**
 *
 * @author Tobias
 */
public class QuickSortDemo
{

    public static void main(String[] args)
    {
        int n = 100;
        int[] array = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < n; ++i)
        {
            array[i] = rnd.nextInt(100) + 1;
        }
        long startTime = System.nanoTime();
        quickSort(array);
        long runTime = System.nanoTime() - startTime;
        for (int i = 0; i < array.length; ++i)
        {
            System.out.println(i + ": " + array[i]);
        }
        System.out.println("Time: " + runTime);
    }

    public static void quickSort(int[] array)
    {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int begin, int end)
    {
        int b = begin;
        int e = end;
        int pivot = array[(begin + end) / 2];

        while (b <= e)
        {
            while (array[b] < pivot) ++b;
            while (array[e] > pivot) --e;
            if (b <= e)
            {
                int tmp = array[b];
                array[b] = array[e];
                array[e] = tmp;
                ++b;
                --e;
            }
        }
        if (begin < e) quicksort(array, begin, e);
        if (b < end) quicksort(array, b, end);
    }
}