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
public class SelectionSort implements SortingAlgorithm
{

    @Override
    public <T> void sort(T[] array, Comparator<T> comparator)
    {
        for(int i = 0; i < array.length-1; ++i)
        {
            int best = i;
            for(int j = i + 1; j < array.length; ++j)
            {
                if(comparator.compare(array[j], array[best]) < 0)
                {
                    best = j;
                }
            }
            T tmp = array[i];
            array[i] = array[best];
            array[best] = tmp;
        }
    }
    
}
