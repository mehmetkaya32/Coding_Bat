package com.array1;

import java.util.Arrays;

public class Unlucky1 {

    public static void main(String[] args) {

        System.out.println();
    }

    public static boolean unlucky1(int[] nums) {

        if(nums.length < 2){
            return false;
        }

        else if (nums[0]==1 && nums[1]==3 ||

                nums[1]==1 && nums[2]==3  ||

                nums[nums.length-2]==1 && nums[nums.length-1]==3 )
        {
            return true; }
        else return false;
    }
}
