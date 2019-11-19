
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LinkedListTest {
    private     LinkedList<String> myLinkedList = new LinkedList<String>();




    @Before
    public void setUp(){

        myLinkedList.add("Zero");
        myLinkedList.add("One");
        myLinkedList.add("Two");
        myLinkedList.add("Three");
        myLinkedList.add("Four");
    }
    @Test
    public void get(){

        Assert.assertEquals(myLinkedList.get(0),"Zero");

        Assert.assertEquals(myLinkedList.get(3),"Three");
    }

    @Test
    public void remove() {

        myLinkedList.remove("Three");

        Assert.assertEquals(myLinkedList.get(3),"Four");

        myLinkedList.remove();

        Assert.assertEquals(myLinkedList.get(0), "One");

    }


    @Test
    public void size() {

        Assert.assertTrue(myLinkedList.size == 5);

        myLinkedList.remove("Three");

        Assert.assertTrue(myLinkedList.size == 4);

    }

    @Test
    public void add() {
        myLinkedList.add(3,"Two and a half");

        Assert.assertEquals(myLinkedList.get(3), "Two and a half");

        Assert.assertTrue(myLinkedList.size == 6);
    }
}
