package com.array1;

import java.util.Arrays;

public class MiddleWay {
    public static void main(String[] args) {

        int c[] = new int[]{1, 3, 8};
        int d[] = new int[]{3, 5, 9};

        System.out.println(Arrays.toString(middleWay(c, d)));
    }

    public static int[] middleWay(int[] a, int[] b) {

        //1st way
//        int[] middle = new int[]{a[1], b[1]};
//


        //2nd way
//        int middle [] = new int[2]; //burada array i initialize ettik
//        middle [0]= a[1];
//        middle [1]= b[1];

              //  return middle;
        return new int[] {a[1], b[1]};
    }
}
