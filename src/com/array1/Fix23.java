package com.array1;

import java.util.Arrays;

public class Fix23 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix23(new int[]{2,3,5})));

    }

    public static int[] fix23(int[] nums) {

        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }
}
