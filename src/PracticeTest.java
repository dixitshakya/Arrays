import org.junit.Test;

import static org.junit.Assert.*;

public class PracticeTest {
int[] array = {1,2,3,4,5};
int n = array.length;
    @Test
    public void isSumPresent() {
        assertEquals(false,Practice.isSumPresent(array,n,1));
    }
    @Test
    public void usingArrayList(){
        assertEquals(false,Practice.isSumPresent(array,n,10));

    }
    @Test
    public void MoveZero() {
        assertEquals(new Integer[]{1,2,3,0,0},Practice.moveZero(new Integer[]{1,0,2,0,3},5));
    }
   @Test
           public void rearangeArrayUsingSort() {
       assertEquals(new Integer[]{-3,-1,2,4}, Practice.rearangeArray(new Integer[]{-1,2,-3,4},4));
   }
    @Test
    public void rearangeEvenOdd() {
        assertEquals(new Integer[]{2,4,1,3}, Practice.rearangeUsingSort(new Integer[]{1,2,3,4},4));
    }
}