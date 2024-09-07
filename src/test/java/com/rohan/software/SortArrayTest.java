package com.rohan.software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {
    @Test
    public void sortedTest()
    {
      try{
          int[] unsorted = null;
          int[] sorted = SortArray.sortingArray(unsorted);
      }
      catch(Exception e){
          System.out.println("Exception Generated");
      }


    }

}