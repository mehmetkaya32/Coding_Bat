package com.array1;

import java.util.Arrays;

public class MiddleWay {
    public static void main(String[] args) {

        int c [] = new int[] {1,4,8};
        int d [] = new int[] {3,5,9};

        System.out.println(Arrays.toString(middleWay(c,d)));
    }

    public static int[] middleWay (int[]a, int[]b){

        return new int[] {a[1], b[1]};
    }
}
