package com.kj.ds;

/**
 * Hello world!
 *
 */
public class LinkedList
{
    Node head;
    Node tail;

    class Node {
        Node next;
        Object data;
        Node(Object d)
        {
            data = d;
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
        }

    }

    public boolean remove(Object d)
    {
        Node n = head;
        while( n.next != null) {
            Node c = n.next;
            if (d.equals(c.data))
            {
                n.next = c.next;
                return true;
            }
            n = c;
        }
        return false;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("[");
        Node n = head;
        while( n.next != null) {
            Node c = n.next;
            n = c;
            s.append(c.data.toString());
            if (c.next != null)
                s.append(",");
        }
        s.append("]");
        return s.toString();
    }
}