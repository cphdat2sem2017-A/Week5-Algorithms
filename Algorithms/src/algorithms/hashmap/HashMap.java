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
public class HashMap<K, V>
{
    private static final int initialCapacity = 8;
    private ListNode<K,V>[] array;
    private int size;

    public HashMap()
    {
        array = new ListNode[initialCapacity];
        size = 0;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void put(K key, V value)
    {
        int index = getIndex(key);
        ListNode<K,V> cur = array[index];
        if(cur == null)
        {
            array[index] = new ListNode<>(key, value);
            ++size;
        }
        else
        {
            ListNode<K,V> last;
            do
            {
                if(cur.getKey().equals(key))
                {
                    cur.setKey(key);
                    cur.setValue(value);
                    return;
                }
                last = cur;
                cur = cur.getNext();
            } while(cur != null);
            last.setNext(new ListNode<>(key, value));
            ++size;
        }
    }
    
    public V get(K key)
    {
        int index = getIndex(key);
        ListNode<K,V> cur = array[index];
        while(cur != null)
        {
            if(key.equals(cur.getKey()))
            {
                return cur.getValue();
            }
            cur = cur.getNext();
        }
        return null;
    }
    
    private int getIndex(K key)
    {
        return Math.abs(key.hashCode()) % array.length;
    }

    private static class ListNode<K, V>
    {

        private K key;
        private V value;
        private ListNode<K, V> next;

        public ListNode(K key, V value)
        {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public K getKey()
        {
            return key;
        }

        public void setKey(K key)
        {
            this.key = key;
        }

        public V getValue()
        {
            return value;
        }

        public void setValue(V value)
        {
            this.value = value;
        }

        public ListNode<K, V> getNext()
        {
            return next;
        }

        public void setNext(ListNode<K, V> next)
        {
            this.next = next;
        }
    }
}
