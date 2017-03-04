/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave5and7;

/**
 *
 * @author Henrik
 */
public class Opg5and7App {
    public static void main(String[] args) {
        
        //== create and fill a tree
        BinarySearchTree bst = new BinarySearchTree();
        bst.addElement(4);
        bst.addElement(3);
        bst.addElement(5);
        bst.addElement(2);
        bst.addElement(6);
        bst.addElement(1);
        bst.addElement(7);
        bst.addElement(8);
        
        System.out.println("Tree inorder: " + bst.inorderTraversal());
        System.out.println("Sum: "   + bst.sum());    
         
        
        System.out.println("Tree preorder: " + bst.preorderTraversal());

    }
}
