package com.WarmUp1;

public class SumDouble {

    public static void main(String[] args) {

        System.out.println(SumDouble(5, 3));
    }

    public static int SumDouble(int a, int b) {

        if (a == b) {
            return 2 * (a + b);
        } else {
            return (a + b);
        }
        //return a==b ? 2*(a+b): (a+b);
    }

}
