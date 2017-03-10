/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.hashmap;

/**
 *
 * @author Tobias
 */
public class HashMapTest
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> myMap = new HashMap<>();
        
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        myMap.put("Four", 4);
        myMap.put("Five", 5);
        myMap.put("Six", 6);
        myMap.put("Seven", 7);
        
        System.out.println("Four: " + myMap.get("Four"));
        System.out.println("Seven: " + myMap.get("Seven"));
        System.out.println("One: " + myMap.get("One"));
        System.out.println("Size: " + myMap.getSize());
        myMap.put("Four", 44);
        System.out.println("Four: " + myMap.get("Four"));
        System.out.println("Size: " + myMap.getSize());
    }
}
