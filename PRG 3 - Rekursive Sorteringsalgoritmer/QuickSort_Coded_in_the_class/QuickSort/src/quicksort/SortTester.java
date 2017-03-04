/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author hau
 */
public class SortTester
{
    public static void main(String[] args)
    {
        int[] numbers = { 3, 7, 2, 5, 1, 8, 9 };
        
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
        System.out.println("");
        
        QuickSort quicksort = new QuickSort();
        quicksort.quicksort(numbers, 0, numbers.length-1);
        
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");       
                
    }
    
}
