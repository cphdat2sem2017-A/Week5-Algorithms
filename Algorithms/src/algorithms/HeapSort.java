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
public class HeapSort implements SortingAlgorithm
{
    @Override
    public <T> void sort(T[] array, Comparator<T> comparator)
    {
        int end = array.length-1;
        makeHeap(array, end, comparator);
        heapSort(array, end, comparator);
    }
    
    private <E> void heapSort(E[] array, int end, Comparator<E> comparator)
    {
        while(end > 0)
        {
            swap(array, 0, end);
            --end;
            heapifyDown(array, 0, end, comparator);
        }
    }

    private int left(int i, int end)
    {
        int res = 2 * i + 1;
        return res > end ? -1 : res;
    }

    private int right(int i, int end)
    {
        int res = 2 * i + 2;
        return res > end ? -1 : res;
    }

    private int parent(int i)
    {
        return i <= 0 ? -1 : (i - 1) / 2;
    }

    private <E> void swap(E[] array, int a, int b)
    {
        E tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    private <E> void heapifyDown(E[] array, int i, int end, Comparator<E> comparator)
    {
        int left = left(i, end);
        if(left >= 0)
        {
            int largeChild = left;
            int right = right(i, end);
            if(right >= 0 && comparator.compare(array[right], array[largeChild]) > 0)
            {
                largeChild = right;
            }
            if(comparator.compare(array[largeChild], array[i]) > 0)
            {
                swap(array, largeChild, i);
                heapifyDown(array, largeChild, end, comparator);
            }
        }
    }

    private <E> void heapifyUp(E[] array, int i, int end, Comparator<E> comparator)
    {
        int parent = parent(i);
        if(parent >= 0 && comparator.compare(array[i], array[parent]) > 0)
        {
            swap(array, i, parent);
            heapifyDown(array, i, end, comparator);
        }
    }
    
    private <E> void makeHeap(E[] array, int end, Comparator<E> comparator)
    {
        for(int i = end; i >= 0; --i)
        {
            heapifyUp(array, i, end, comparator);
        }
    }

}