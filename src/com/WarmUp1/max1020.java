package com.WarmUp1;

/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */
public class max1020 {
    public static void main(String[] args) {

        System.out.println(maX1020(12, 15));
    }


    public static int maX1020(int a, int b) {

        // First make it so the bigger value is in a
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;

        }

        if (a >= 10 && a <= 20) {
            return a;
        }

        if (b >= 10 && b <= 20) {
            return b;
        } else

        return 0;

    }
}

