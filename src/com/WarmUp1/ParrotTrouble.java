package com.WarmUp1;

public class ParrotTrouble {
    public static void main(String[] args) {

        System.out.println(ParrotTrouble(true, 8));
    }

    public static boolean ParrotTrouble(boolean talking, int hour) {

        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }
}
