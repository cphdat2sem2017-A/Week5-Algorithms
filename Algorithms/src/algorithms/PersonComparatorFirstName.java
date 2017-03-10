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
public class PersonComparatorFirstName implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2)
    {
        int c = o1.getFirstName().compareTo(o2.getFirstName());
        if(c != 0)
        {
            return c;
        }
        return o1.getLastName().compareTo(o2.getLastName());
    }
    
}
