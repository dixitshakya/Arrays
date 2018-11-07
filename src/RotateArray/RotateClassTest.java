package RotateArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateClassTest {

    @org.junit.Test
    public void RotationTest() {
        //usingTempArray
       assertArrayEquals(new Integer[]{3,4,5,6,1,2},RotateClass.usingTempArray(new Integer[]{1,2,3,4,5,6},2,6));
       assertArrayEquals(new Integer[]{0},RotateClass.usingTempArray(new Integer[]{0},1,1));
    }
    @org.junit.Test
    public void usingOneByOne(){
        assertArrayEquals(new Integer[]{3,4,5,6,1,2},RotateClass.usingOneByOne(new Integer[]{1,2,3,4,5,6},2,6));

    }

    @org.junit.Test
    public void usingMod(){
        assertArrayEquals(new Integer[]{3,4,5,6,1,2},RotateClass.usingMod(new Integer[]{1,2,3,4,5,6},2,6));

    }
    @org.junit.Test
    public void usingReverse(){
        assertArrayEquals(new Integer[]{3,4,5,6,1,2},RotateClass.usingReverse(new Integer[]{1,2,3,4,5,6},2,6));

    }

}