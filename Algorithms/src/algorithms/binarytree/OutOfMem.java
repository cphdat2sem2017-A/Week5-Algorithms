/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.binarytree;

/**
 *
 * @author Tobias
 */
public class OutOfMem
{
    public OutOfMem next;
    public int[] data;
    public OutOfMem(OutOfMem next)
    {
        this.next = next;
        this.data = new int[1000000];
    }
    
    public static void main(String[] args)
    {
        OutOfMem cur = null;
        
        
        while(true)
        {
            cur = new OutOfMem(cur);
        }
    }
}
