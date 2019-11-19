
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

    private ArrayList<String> myArrayList = new ArrayList<String>();

    @Before
    public void setUp(){

        myArrayList.add("Zero");
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Three");
        myArrayList.add("Four");
    }
    @Test
    public void get(){

        Assert.assertEquals(myArrayList.get(0),"Zero");

        Assert.assertEquals(myArrayList.get(3),"Three");
    }

    @Test
    public void remove() {

        myArrayList.remove("Three");
        
        Assert.assertEquals(myArrayList.get(3),"Four");

        myArrayList.remove();

        Assert.assertEquals(myArrayList.get(0), "One");

    }


    @Test
    public void size() {

        Assert.assertTrue(myArrayList.size == 5);

        myArrayList.remove("Three");

        Assert.assertTrue(myArrayList.size == 4);

    }

    @Test
    public void add() {
        myArrayList.add(3,"Two and a half");

        Assert.assertEquals(myArrayList.get(3), "Two and a half");

        Assert.assertTrue(myArrayList.size == 6);
    }
}
