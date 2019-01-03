package com.kj.ds;

/**
 * Hello world!
 *
 */
public class LinkedList
{
    private Node head;
    private Node tail;
    private int size = 0;
    class Node {
        Node next;
        Object data;
        Node(Object d)
        {
            data = d;
        }
        public String toString()
        {
            return "Node :" + data.toString();
        }
    }

    public void add(Object d)
    {
        Node n = new Node(d);
        if ( head == null)
        {
            head = n;
            tail = n;
        }
        else
        {
            tail.next = n;
            tail = n;
        }
        size ++;
    }

    public boolean remove(Object d)
    {
        Node n = head;
        Node p = null;
        while( n!= null) {
            if (d.equals(n.data))
            {
                if ( p != null)
                    p.next = n.next;
                else
                    head = n.next;
                size --;
                if (size <= 1) tail = head;
                return true;
            }
            p = n;
            n = n.next;
        }
        return false;
    }

    public int size()
    {
        return size;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("[");
        Node n = head;
        while( n != null) {
            s.append(n.data.toString());
            if (n.next != null)
                s.append(",");
            n = n.next;
        }
        s.append("]");
        return s.toString();
    }
}