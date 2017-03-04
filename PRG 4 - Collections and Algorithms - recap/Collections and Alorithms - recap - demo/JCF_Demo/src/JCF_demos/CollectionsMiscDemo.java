package JCF_demos;

import java.util.*;
// Demo: Use of some features in JFC 
//
// Interfaces: List
// Implementations: LinkedList
// Methods in: Collections and Arrays
//
// hau

public class CollectionsMiscDemo
{

    public static void main(String[] args)
    {
        //-- create and fill a list of Strings
        List<String> myList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++)
        {
            myList.add("" + random.nextInt(10));  // add to the end of list
        }

        //-- sort a list
        //   Collections class
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
        System.out.println("");

        //-- traverse a list
        //   Iterator interface
        Iterator<String> myIterator = myList.iterator();
        while (myIterator.hasNext())
        {
            System.out.println("Element " + myIterator.next());
        }
        System.out.println("");

        //-- Transfer a List to an array
        String[] str = myList.toArray(new String[0]);
        System.out.println("Array length : " + str.length);
        System.out.println("First element: " + str[0]);
        System.out.println();

        //-- Transfer an array to a List
        //   Arrays class
        List myList2 = Arrays.asList(str);
        System.out.println(myList2);

    }

}
