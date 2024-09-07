package com.rohan.software;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    public void getDiameter(){

        Assertions.assertEquals(10, Circle.diameter(5),"Case Not Passed : Expected result not found");
    }



}