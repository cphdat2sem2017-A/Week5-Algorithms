package JCF_solutions;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String... args){
        System.out.println("Hello Hashmap");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        
        System.out.println("Values at 7, 9, 3: ");
        System.out.println(map.get(7));
        System.out.println(map.get(9));
        System.out.println(map.get(3));
        
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("zero", 0);
        map2.put("one", 1);
        map2.put("two", 2);
        map2.put("three", 3);
        map2.put("four", 4);
        map2.put("five", 5);
        map2.put("six", 6);
        map2.put("seven", 7);
        map2.put("eight", 8);
        map2.put("nine", 9);
        
        
        System.out.println("Values at one, five, seven: ");
        System.out.println(map2.get("one"));
        System.out.println(map2.get("five"));
        System.out.println(map2.get("seven"));
    }
    
}
