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
public class BinaryTreeNode
{
    private final int data;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode(int data)
    {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
    
    public void setLeftChild(BinaryTreeNode left)
    {
        this.leftChild = left;
    }
    
    public void setRightChild(BinaryTreeNode right)
    {
        this.rightChild = right;
    }

    public int getData()
    {
        return data;
    }

    public BinaryTreeNode getLeftChild()
    {
        return leftChild;
    }

    public BinaryTreeNode getRightChild()
    {
        return rightChild;
    }
    
    @Override
    public String toString()
    {
        StringBuilder res = new StringBuilder();
        res.append("(").append(data).append(",");
        if(leftChild == null)
        {
            res.append("*");
        }
        else
        {
            res.append(leftChild);
        }
        res.append(", ");
        if(rightChild == null)
        {
            res.append("*");
        }
        else
        {
            res.append(rightChild);
        }
        res.append(")");
        return  res.toString();
    }
}
