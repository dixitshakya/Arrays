package ReverseArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseArrayTest {
Integer[] array = {1,2,3,4,5};
Integer[] reverse ={5,4,3,2,1};
int n = array.length;
    @Test
    public void usingStack() {
        assertArrayEquals(reverse,ReverseArray.usingStack(array,n));
    }
    @Test
    public void usingSE() {
        assertArrayEquals(reverse,ReverseArray.usingStack(array,n));
    }

    @Test
    public void StringReverse() {
        assertEquals("aa",ReverseArray.usingRecursion("aa"));

    }
}