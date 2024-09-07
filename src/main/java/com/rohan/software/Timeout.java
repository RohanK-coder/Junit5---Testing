package com.rohan.software;

import java.util.Arrays;

public class Timeout {
    public static void sortTimeout(){
        int[] arr = new int[]{2,4,1,0};
        for(int i=0;i<100000;i++){
            Arrays.sort(arr);
        }

    }
}
