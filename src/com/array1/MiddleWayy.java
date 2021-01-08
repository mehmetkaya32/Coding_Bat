package com.array1;

import java.util.Arrays;

public class MiddleWayy {
    public static void main(String[] args) {

        int[] c = new int[] {2,7,6};
        int[] d = new int[] {1,3,5};

        System.out.println(Arrays.toString(MiddleWayy(c,d)));

    }

    public static int[] MiddleWayy(int[]a, int[]b){

        //1st way
//        int[] middle = new int[2];
//        middle[0] = a[1];
//        middle[1] = b[1];

        //2nd way
//        int[] middle = new int[] {a[1], b[1]};
//        return middle;

        return new int[] {a[1], b[1]};
    }
}
