/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Tobias
 */
public class PersonSorting
{
    public static void main(String[] args)
    {
        int n = 200000;
        Person[] persons = new Person[n];
        PersonFactory fac = new PersonFactory();
        for(int i = 0; i < n; ++i)
        {
            persons[i] = fac.createPerson();
        }
        /*
        System.out.println("Unsorted:");
        for(Person p : persons)
        {
            System.out.println(p);
        }
        */
        PersonComparatorFirstName comp = new PersonComparatorFirstName();
        CountComparator<Person> countComp = new CountComparator<>(comp);
        //SortingAlgorithm sorter = new SelectionSort();
        SortingAlgorithm sorter = new HeapSort();
        sorter.sort(persons, countComp);
        System.out.println("Compares: " + countComp.getCount());
        /*
        System.out.println("\n\nSorted persons:");
        for(Person p : persons)
        {
            System.out.println(p);
        }
        */
    }
}
