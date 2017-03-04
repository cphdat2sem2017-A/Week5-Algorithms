package JCF_solutions;

import java.util.*;

// Demo: Easy removal of duplicates in list using HashSet.
// hau
public class RemoveDublicates
{

    public static void main(String[] args)
    {
        //-- create a list of integers known to have duplicates
        List<Integer> list = new ArrayList<>();
        int numberOfElements = 100;
        for (int i = 0; i < numberOfElements; i++)
        {
            list.add(i % 10);
        }
        System.out.println(list);

        
          
        //-- remove duplicates
        
        //-- 1) transfer all elements from the list to a HashSet and back 
        HashSet hashS = new HashSet(numberOfElements);
//        for (int i = 0; i < size; i++)
//        {
//            hashS.add(list.remove(0));
//        }
//        
//        Iterator iter = hashS.iterator();
//        while(iter.hasNext())
//        {
//            list.add((Integer)iter.next());
//        }           
//
//        System.out.println(list);
        
        //-- 2)  alternative solution
        hashS.addAll(list);
        list.clear();
        list.addAll(hashS);

        System.out.println(list);
    }
}
