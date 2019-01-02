package com.kj.ds;

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

    public void testLinkedList()
    {
        assertTrue(true);
    }
}
