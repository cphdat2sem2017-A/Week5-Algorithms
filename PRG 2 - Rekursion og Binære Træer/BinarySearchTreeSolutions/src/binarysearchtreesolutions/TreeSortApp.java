/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtreesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Henrik
 */
public class TreeSortApp
{

    public static void main(String[] args)
    {

        // create a list of integers
        Integer[] l =
        {
            2, 4, 6, 8, 7, 5, 3, 1
        };
        List<Integer> al = new ArrayList<>(Arrays.asList(l));

        for (int i = 0; i < al.size(); i++)
        {
            System.out.print(al.get(i) + " ");
        }
        System.out.println("");

        // Binary tree sort
        BinaryTree bt = new BinaryTree();
        for (int i = 0; i < al.size(); i++)
        {
            bt.insert(al.get(i));
        }
        
//        bt.printTree();
        
        
        List sorted = bt.getAsListInorder();

        // print out
        for (int i = 0; i < sorted.size(); i++)
        {
            System.out.print(sorted.get(i) + " ");
        }
        System.out.println("");

    }

}
