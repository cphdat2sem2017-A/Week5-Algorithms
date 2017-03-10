/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Comparator;


/**
 *
 * @author Tobias
 */
public interface SortingAlgorithm
{
    public <T> void sort(T[] array, Comparator<T> comparator);
}
