package JCF_solutions;

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
        System.out.println("Unsorted:");
        for (int i = 0; i < al.size(); i++)
        {
            System.out.print(al.get(i) + " " );
        }
        System.out.println("");

        
        
        //-- Implement "Binary tree sort":
        //   1) insert all elements into a binary search tree
        //   2) let the tree return a list with all elements inorder
        BinaryTree bt = new BinaryTree();
        for (int i = 0; i < al.size(); i++)
        {
            bt.insert(al.get(i));
        }

        List sorted = bt.getAsListInorder();

        // print out
        for (int i = 0; i < sorted.size(); i++)
        {
            System.out.print(sorted.get(i) + " ");
        }
        System.out.println("");

    }

}
