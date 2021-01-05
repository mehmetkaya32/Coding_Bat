package com.array1;

import java.util.Arrays;

public class MakeEnds {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(makeEnds(new int[]{1, 4, 5, 9})));

    }
    public static int[] makeEnds(int[] nums) {

        return new int[]{nums[0], nums[nums.length - 1]};
    }
}
