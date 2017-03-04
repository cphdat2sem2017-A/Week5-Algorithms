package recursiveSortingPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        //stuff();
        opgave4_3();
    }

    private static void stuff() {
        //== create and fill array
        int max = 200_000;
        int[] arr = new int[max];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(max * 10);
        }

        //== Timing =============
        long startTime = System.nanoTime();

//Quicksort.quicksort(arr, 0, arr.length - 1);
//HeapSort.heapsort(arr, arr.length );
//Arrays.sort(arr);
//SelectionSort.selectionSort(arr);
//MergeSort.merge_sort_start(arr);
//MergeSortLinkedLists.merge_sort_start(arr);
//MergeSortCircularArrayLists.merge_sort_start(arr);
        long timeElapsed = System.nanoTime() - startTime;
//=========================

// print 20 first
        for (int i = 0; i < 19; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[19] + ", ...");

        System.out.println("Time elapsed (micro sec): " + timeElapsed / 1000);
    }

    public static void opgave4_1() {
        ArrayList al = new ArrayList();
        LinkedList ll = new LinkedList();
        Random rnd = new Random();
        int N = 10_000_000;
        for (int i = 0; i < N; i++) {
            int val = rnd.nextInt(N * 10);
            al.add(val);
            ll.add(val);
        }
        //== Timing =============
        long startTime;
        long timeElapsed;
        startTime = System.nanoTime();
        Collections.sort(ll);
        timeElapsed = System.nanoTime() - startTime;

        System.out.println("Time to sort ArrayList (micro sec): " + timeElapsed / 1000);

        //== Timing =============
        startTime = System.nanoTime();
        Collections.sort(al);
        timeElapsed = System.nanoTime() - startTime;

        System.out.println("Time to sort LinkedList (micro sec): " + timeElapsed / 1000);
    }

    public static void opgave4_2(){
        Integer[] elem = {9, 5,7,8,3,5,2,9,2};
        // insert all elements into a set
        //Set<Integer> mySet = new HashSet<>(Arrays.asList(elem));
        Set<Integer> mySet = new HashSet<>();
        for( int i : elem) mySet.add(i);
        // pick out all the elements from the set
        //elem = mySet.toArray(new Integer[mySet.size()]);
        for (int j: mySet)
            System.out.println(j);
        // print the elements to verify
        //System.out.println(Arrays.toString( elem ));
    }
    
    public static void opgave4_3(){
        // Lav en instans af binary tree
        BinaryTree bt = new BinaryTree();
        // indsæt en række tal i træet
        bt.insert(9);
        bt.insert(7);
        bt.insert(12);
        bt.insert(3);
        bt.insert(42);
        // kald en metode der trækker tallene ud i sorteret orden (inorder)
        List<Integer> s = bt.getSorted();
        // skriv dem ud
        for( int elem : s)
            // skriv elem ud
            System.out.println(elem);
    }
}
