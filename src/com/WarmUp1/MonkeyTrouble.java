package com.WarmUp1;

import java.util.Arrays;

/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
 */
public class MonkeyTrouble {

    public static void main(String[] args) {

        System.out.println(MonkeyTrouble(true, false));
    }

    public static boolean MonkeyTrouble (boolean aSmile, boolean bSmile) {

//        if(aSmile == bSmile){
//            return true;
//        } else {
//            return false;
//        }

        //return (aSmile != bSmile);
        //return ((aSmile==bSmile) || (!aSmile == !bSmile));

        return (aSmile != bSmile) ? false : true;
    }
}
