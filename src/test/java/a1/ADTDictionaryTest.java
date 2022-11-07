package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class  ADTDictionaryTest{


    private static ADTDictionary<Integer, String> dict;
    private static  ADTDictionary<Integer, String> dict2;

    @BeforeAll
    public static void setUp() {
        dict = new SDictionary<Integer, String>();
        dict2 = new DDictionary<Integer, String>();
    }

    @BeforeEach
    void populate(){
       dict.clear();
       dict.insert(0, "red");
       dict.insert(1, "blue");
       dict.insert(2,"yellow");
       dict.insert(3, "grey");

       dict2.clear();
       dict2.insert(0, "Mango");
       dict2.insert(1, "banana");
       dict2.insert(2,"orange");
       dict2.insert(3, "apple");
    }

    @Test
    void testClear() {
        dict.clear();
        assertEquals(0, dict.size(), "clear failed, size is non zero");

        dict2.clear();
        assertEquals(0, dict2.size(), "clear failed, size is non zero");
    }

    @Test
    void testInsert() {
        dict.insert(4, "black");
        assertEquals(5, dict.size(), "insert failed, size is not as expected");
        assertEquals("black", dict.find(4));

        //test double linked list
        dict.insert(4, "grapes");
        assertEquals(6, dict.size(), "insert failed, size is not as expected");
    }

    @Test
    void testRemove() {
        assertEquals("red", dict.remove(0));
        assertEquals(null, dict.find(0));
        assertEquals("grey", dict.find(3), "remove failed");

        //test DL list
        assertEquals("yellow", dict.remove(2));
        assertEquals(null, dict.find(2));
    }

    @Test
    void testRemoveAny() {
        dict.removeAny();
        assertEquals(3, dict.size());
        assertNotEquals("grey", dict.removeAny(), "removeAny failed");
        assertEquals(null, dict.find(3));
        assertEquals("red", dict.find(0));


    }

    @Test
    void testFind() {
        assertEquals("grey", dict.find(3), "find failed");
        assertEquals("banana", dict2.find(1));
    }

    @Test
    void testSize() {
        dict.clear();
        dict.insert(0, "red");
        assertEquals(1, dict.size(), "size failed, size is not as expected");
    }

}