package com.WarmUp1;

public class SleepInn {
    public static void main(String[] args) {

        System.out.println(SleepInn(true, true));
    }

    public static boolean SleepInn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
        //return !weekday || vacation;
    }
}
