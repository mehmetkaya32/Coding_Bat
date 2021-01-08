package com.Array2;

import java.util.Arrays;

public class CenteredAverage {
    public static void main(String[] args) {

        System.out.println(centeredAverage(new int[]{1,2,3,4,100}));
    }

    public static int centeredAverage(int[] nums){

            int min= nums[0];
            int max=nums[0];
            int sum=0;

            for ( int i=0 ; i<nums.length ; i++){
                min= Math.min( min, nums[i]);
                max= Math.max( max, nums[i]);
                sum+= nums[i];
            }

            return  (sum-max-min ) / (nums.length-2);
        }
    }

