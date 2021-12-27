package List;

import org.junit.Test.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public abstract class ListTest {

    public abstract <T> List<T> createList();

    @Test
    public void testAdd(){
        List<Integer> list = createList();
        assertEquals(0,list.size());
        list.add(42);
        assertEquals(1,list.size());
        list.add(17);
        assertEquals(2,list.size());
    }

    @Test
    public void testGet(){
        List<Integer> list = createList();
        list.add(42);
        assertEquals(42,list.get(0));
        list.add(17);
        assertEquals(42,list.get(0));
        assertEquals(17,list.get(1));

    }

    @Test
    public void testGetOutOfRange(){
        List<Integer> list = createList();
        assertThrows(IndexOutOfBoundsException.class,()->{
            list.get(0);
        });

    }

    @Test
    public void testRemove(){
        List<Integer> list = createList();

        list.add(42);

        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        list.add(21);
        assertEquals(42,list.remove(0));
        assertEquals(17,list.remove(0));
        assertEquals(20,list.remove(2));
    }

    @Test
    public void testRemoveOutOfRange(){
        List<Integer> list = createList();
        assertThrows(IndexOutOfBoundsException.class,()->{
            list.remove(0);
        });
        list.add(3);
        assertThrows(IndexOutOfBoundsException.class,()->{
            list.remove(1);
        });
    }

    @Test
    public void testReverse(){
        List<Integer> list = createList();
        list.add(42);
        list.add(17);
        list.reverse();
        assertEquals(17,list.get(0));
        assertEquals(42,list.get(1));

    }


}
