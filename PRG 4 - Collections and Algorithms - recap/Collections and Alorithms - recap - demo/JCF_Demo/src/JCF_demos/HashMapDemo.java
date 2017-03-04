package JCF_demos;

import java.util.*;


// Demo: Retrieval of element in hashtable runs in constant time
// hau
public class HashMapDemo {
	 public static void main(String[] args)
	  {
                //-- create a hashmap 
                int initCapacity = 10000000;   // vary
		Map<Integer,Integer> myMap = new HashMap(initCapacity);               
		
                //-- insert elements into map with random (key,value) 
                //   insert one hard coded pair (known to exist)
                int noOfElements = initCapacity/2;
                Random random = new Random();
		for (int i = 0; i < noOfElements; i++) {       
                        int key = random.nextInt(10000);
                        myMap.put(key, key);
		}
                myMap.put(1234, 5678);
		 
                
                //-- measure execution time for get()
                long startTime = System.nanoTime();        
                Integer element = myMap.get(1234);                        
                long executionTime = System.nanoTime() - startTime;
                
                
                System.out.println(element);
                System.out.println("Time elapsed (micro sec): " + executionTime/1000);             
               
	  }
}
