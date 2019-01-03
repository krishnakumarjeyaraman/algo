package com.kj.ds;

import com.kj.ds.LinkedList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LinkedListTest extends TestCase
{
    public LinkedListTest(String testName)
    {
        super(testName);
    }

    public static Test getSuite()
    {
        return new TestSuite(LinkedListTest.class);
    }

    private LinkedList init (int size)
    {
        LinkedList l = new LinkedList();
        for(int i=1; i<= size; i++)
            l.add("" + i);
        return l;
    }
    public void testAdd()
    {
        LinkedList l = init(2);
        assertTrue(l.size() == 2);
        assertTrue(l.toString().equals("[1,2]"));
    }

    public void testRemove()
    {
        LinkedList l = init(2);
        l.remove("1");
        assertTrue(l.size() == 1);
        assertTrue(l.toString().equals("[2]"));
        l.remove("2");
        assertTrue(l.size() == 0);
        assertTrue(l.toString().equals("[]"));

    }
}
