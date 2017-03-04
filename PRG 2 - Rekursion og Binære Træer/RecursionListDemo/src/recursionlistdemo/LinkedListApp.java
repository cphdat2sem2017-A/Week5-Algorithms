package recursionlistdemo;

import java.util.Random;


public class LinkedListApp {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		for (int i = 0; i < 10; i++) {
			list.insert(i);
		}
		
		list.printList();
//              list.printReverse();
//		System.out.println(list.lookup(9));
//              System.out.println(list.count());
		
	}
}
