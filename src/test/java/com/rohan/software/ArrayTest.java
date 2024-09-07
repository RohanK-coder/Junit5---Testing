package com.rohan.software;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    @Test
    public void arrayTest(){
        int[] expected = new int[]{2,3,4,5};
        int [] actual = new int[]{2,3,4,5};
        Assertions.assertArrayEquals(expected,actual,"Fucked it up");
    }
}
