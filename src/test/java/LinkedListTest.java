
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class LinkedListTest {
    private     java.util.LinkedList<String> javaLinkedList = new java.util.LinkedList<String>();
    private     LinkedList<String> myLinkedList = new LinkedList<String>();



    @Before
    public void setUp(){


        javaLinkedList.add("Zero");
        javaLinkedList.add("One");
        javaLinkedList.add("Two");
        javaLinkedList.add("Three");
        javaLinkedList.add("Four");

        myLinkedList.add("Zero");
        myLinkedList.add("One");
        myLinkedList.add("Two");
        myLinkedList.add("Three");
        myLinkedList.add("Four");
    }

    @Test
    public void remove() {
        javaLinkedList.remove("Three");
        myLinkedList.remove("Three");

        System.out.println(javaLinkedList.get(3) + myLinkedList.get(3));

        Assert.assertEquals(javaLinkedList.get(3),myLinkedList.get(3));
    }


//    @Test
//    public void size() {
//    }
//
//    @Test
//    public void get() {
//    }
//
//    @Test
//    public void testAdd() {
//    }
}
