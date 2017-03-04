package recursionlistdemo;

public class LinkedList
{
	private Node head;	
	
	public void LinkedList()
	{
		head = null;
	}
	
	//-- insert new data as first element
	public void insert(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head 	     = newNode;
	}
	
	
	//-- print in normal order
	public void printList()
	{
		Node currNode = head;
		while (currNode != null)
		{
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}
	
	
	//-- print in reverse order
	//   this method is called by client
//	public void printReverse()
//	{
//		printReverseRec(head);
//	}
//	
//	//  Recursive method
//	private void printReverseRec(Node n)
        
//        insert code here ..
	
	
        
	//-- search for key
	//   this method is called by client
//	public boolean lookup(int key)
	
        // insert code ....
	
	
	// recursive method
//	private boolean lookupRec(Node n, int key)
	
        // insert code here ....				
	
        
        //-- Extra: count elements
//        public int count()
        
         // insert code here ..     
        
        // recursive method  
        
        // insert code here ...
	
	//=======================
	private static class Node
	{
		Node next;
		int data;
	
		Node(int newData) 
		{
			next = null;
			data = newData;
		}
	}
	

	
	
}