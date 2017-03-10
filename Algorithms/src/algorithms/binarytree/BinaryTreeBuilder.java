/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.binarytree;

import java.util.Random;

/**
 *
 * @author Tobias
 */
public class BinaryTreeBuilder
{

    public static void main(String[] args)
    {
        int n = 20;
        Random rnd = new Random();
        int[] test = new int[n];
        for(int i = 0; i < n; ++i)
        {
            test[i] = rnd.nextInt(100)+1;
        }
        BinaryTreeNode root = buildTree(test);
        System.out.println(root);
        leftToRight(root);
        System.out.println("Height: " + getHeight(root));
        writeLayers(root);
    }
    
    public static void leftToRight(BinaryTreeNode node)
    {
        if(node.getLeftChild() != null)
        {
            leftToRight(node.getLeftChild());
        }
        System.out.println(node.getData());
        if(node.getRightChild() != null)
        {
            leftToRight(node.getRightChild());
        }
    }
    
    public static int getHeight(BinaryTreeNode node)
    {
        if(node == null) return 0;
        BinaryTreeNode left = node.getLeftChild();
        BinaryTreeNode right = node.getRightChild();
        return 1 + Math.max(getHeight(left), getHeight(right));
    }
    
    public static void writeLayers(BinaryTreeNode node)
    {
        int height = getHeight(node);
        for(int i = 1; i <= height; ++i)
        {
            writeLayer(node, 0, i);
            System.out.println();
        }
    }
    
    public static void writeLayer(BinaryTreeNode node, int curLayer, int layer)
    {
        if(node == null) return;
        ++curLayer;
        if(curLayer == layer)
        {
            System.out.print(node.getData() + " ");
        }
        else
        {
            writeLayer(node.getLeftChild(), curLayer, layer);
            writeLayer(node.getRightChild(), curLayer, layer);
        }
    }

    public static BinaryTreeNode buildTree(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return null;
        }
        BinaryTreeNode root = new BinaryTreeNode(array[0]);
        for (int i = 1; i < array.length; ++i)
        {
            insert(array[i], root);
        }
        return root;
    }

    private static void insert(int data, BinaryTreeNode node)
    {
        if(data == node.getData()) return;
        if (data < node.getData())
        {
            //Go left
            BinaryTreeNode child = node.getLeftChild();
            if (child == null)
            {
                child = new BinaryTreeNode(data);
                node.setLeftChild(child);
            } else
            {
                insert(data, child);
            }
        } else
        {
            //Go right
            BinaryTreeNode child = node.getRightChild();
            if (child == null)
            {
                child = new BinaryTreeNode(data);
                node.setRightChild(child);
            } else
            {
                insert(data, child);
            }
        }
    }
}
