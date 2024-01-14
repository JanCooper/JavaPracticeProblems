package com.janco.TwoSum;

import java.util.*;

public class TwoSum {
    // TWO SUM
    // Given an array of integers nums and an integer target, return indices of the
    // two numbers such that they add up to the target.
    public static void Call(){
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;

        System.out.println("============== Two Sum Brute Force =============================================");
        System.out.println("Input: " + Arrays.toString(nums) + ", " + target);
        System.out.println("Output = " + TwoSum.bruteForceTwoSum(nums, target));
        System.out.println("================== Two Sum Hash ================================================");
        System.out.println("Input: " + Arrays.toString(nums) + ", " + target);
        System.out.println("Output = " + "Output = " + TwoSum.hashTwoSum(nums, target));
        System.out.println("=================== Two Sum Sorted =============================================");
        System.out.println("Input: " + Arrays.toString(nums) + ", " + target);
        System.out.println("Output = " + TwoSum.sortedTwoSum(nums, target));
        System.out.println("================================================================================");
        System.out.println();
    }
    private static List<Integer> bruteForceTwoSum(int[] nums, int target) {
        System.out.println("Brute Force Two Sum");
        List<Integer> returnValue = new ArrayList<>();
        int[] nums1 = nums.clone();
        int[] nums2 = nums.clone();
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if(nums1[i] + nums2[j] == target) {
                    index1=i;
                    index2=j;
                }
            }
        }
        returnValue.add(index1);
        returnValue.add(index2);
        return returnValue;
    }

    private static List<Integer> hashTwoSum(int[] nums, int target) {
        System.out.println("Hash Two Sum");
        List<Integer> returnValue = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int sum = target - nums[i];
            if(numsMap.containsKey(sum)){
                index1 = i;
                index2 = numsMap.get(sum);
                break;
            }
        }
        returnValue.add(index1);
        returnValue.add(index2);
        return returnValue;
    }

    private static List<Integer> sortedTwoSum(int[] nums, int target) {
        System.out.println("Sorted Two Sum");
        List<Integer> returnValue = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int sum = 0;

        while(sum != target){
            sum = nums[leftIndex] + nums[rightIndex];

            if (sum < target){
                leftIndex++;
            } else if (sum > target){
                rightIndex = rightIndex - 1;
            }
        }
        returnValue.add(nums[leftIndex]);
        returnValue.add(nums[rightIndex]);
        return returnValue;
    }
}
