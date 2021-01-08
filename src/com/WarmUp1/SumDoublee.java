package com.WarmUp1;

/*

Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */
public class SumDoublee {

    public static void main(String[] args) {

        System.out.println(SumDoublee(3, 7));
    }

    public static int SumDoublee(int a, int b) {

//        if (a == b) {
//            return 2 * (a + b);
//        } else {
//            return (a + b);
//        }
        return (a == b) ? 2 * (a + b) : (a + b);
    }
}

