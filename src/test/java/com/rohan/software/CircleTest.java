package com.rohan.software;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CircleTest {
    CircleTest(){
        System.out.println("Object is created !!!!! ");
    }
    @Test
    public void getDiameter(){

        Assertions.assertEquals(10, Circle.diameter(5),"Case Not Passed : Expected result not found");
    }

    @Test
    public void getD(){

        Assertions.assertEquals(10, Circle.diameter(5),"Case Not Passed : Expected result not found");
    }

    // once before every test case
    @BeforeEach
    public void testBeforeEach(){
        System.out.println("Before Each method invoked");
    }

    //once after every test case
    @AfterEach
    public void testAfterEach(){
        System.out.println("Closing the resources and all the test cases");
    }

    //only once that too at the beginning
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All this is done");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all");
    }



}