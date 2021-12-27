package Set;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public abstract class SetTest {

    public abstract <T> Set<T> createSet();

    @Test
    public void testAdd(){
        Set<String> set = createSet();
        assertEquals(0,set.size());
        assertTrue(set.add("keren"));
        assertEquals(1,set.size());
        assertTrue(set.add("ruilin"));
        assertEquals(2,set.size());
        //Object[] values =set.toArray();
        //assertArrayEquals(new String[] {"keren","ruilin"},values);

        String[] expect = new String[]{"keren","ruilin"};
        checkSetContents(set, expect);

    }

    @Test
    public void testAddNull(){
        Set<String> set = createSet();
        assertFalse(set.add(null));
    }


    @Test
    public void testAddDupilicate(){
        Set<String> set = createSet();
        assertEquals(0,set.size());
        assertTrue(set.add("keren"));
        assertEquals(1,set.size());
        assertFalse(set.add("keren"));
        assertEquals(1,set.size());
    }

    @Test
    public void testRemove(){
        Set<String> set = createSet();
        assertTrue(set.add("keren"));
        assertEquals(1,set.size());
        assertFalse(set.remove("ruilin"));
        checkSetContents(set,new String[]{"keren"});

        assertEquals(1,set.size());
        assertTrue(set.add("ruilin"));


        assertTrue(set.remove("keren"));
        assertEquals(1,set.size());
        String[] expected = new String[]{"ruilin"};
        checkSetContents(set,expected);

    }

    @Test
    public void testContains(){
        Set<String> set = createSet();
        set.add("a");
        set.add("b");
        set.add("c");
        assertTrue(set.contains("b"));
        assertTrue(set.contains("c"));
        assertFalse(set.contains("ruilin"));
        assertFalse(set.contains(null));
    }


    private void checkSetContents(Set<String> set, String[] expect) {
        Object[] actual = set.toArray();
        Arrays.sort(actual);
        Arrays.sort(expect);
        assertArrayEquals(actual, expect);
    }

}
