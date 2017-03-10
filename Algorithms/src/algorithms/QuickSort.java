/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Comparator;

/**
 *
 * @author Tobias
 */
public class QuickSort implements SortingAlgorithm
{
    @Override
    public <T> void sort(T[] array, Comparator<T> comparator)
    {
        quicksort(array, comparator, 0, array.length-1);
    }
 
    private <T> void quicksort(T[] array, Comparator<T> comparator, int begin, int end)
    {
        int b = begin;
        int e = end;
        T pivot = array[(begin + end) / 2];

        while (b <= e)
        {
            while (comparator.compare(array[b], pivot) < 0) ++b;
            while (comparator.compare(array[e], pivot) > 0) --e;
            if (b <= e)
            {
                T tmp = array[b];
                array[b] = array[e];
                array[e] = tmp;
                ++b;
                --e;
            }
        }
        if (begin < e) quicksort(array, comparator, begin, e);
        if (b < end) quicksort(array, comparator, b, end);
    }
}
