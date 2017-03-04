/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Opg2_studtest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Henrik
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Jannik
 */
public class Opgave2
{

    public static void main(String[] args)
    {
        int[] array =
        {
            1000000, 10, 100, 2, 5, 2, 9, 7, 1, 2, 3, 5, 110, 9, 1, 2, 6, 44, 44, 5, 112, 112
        };
//        {
//            1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 11, 11, 11,
//        };

        Opgave2 o = new Opgave2();
        o.freq(array);//array);
    }

    public void freq(int[] arr)
    {
        Arrays.sort(arr);
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<Integer, Integer>();
        for (int b : arr)
        {
            if (freq.containsKey(b))
            {
                freq.replace(b, freq.get(b) + 1);
            } else
            {
                freq.put(b, 1);
            }
        }
        Set<Entry<Integer, Integer>> set = freq.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext())
        {
            Entry<Integer, Integer> entry = (Entry<Integer, Integer>) it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
