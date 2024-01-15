package com.janco.RemoveElement;

import java.util.*;

public class RemoveElement {
    // Given an integer array nums and an integer val, remove
    // all occurrences of val in nums IN PLACE, then return the
    // number of elements in nums which are not equal to val.
    // The order of the elements may be changed.
    //
    // Change the array nums such that the first k elements of nums
    // contain the elements which are not equal to val. The remaining
    // elements of nums or size of nums are not important.
    //
    // Return k.

    public static void Call () {
        int[] nums1 = new int[] {3,2,2,3};
        int[] nums2 = new int[] {0,1,2,2,3,0,4,2};
        int[] nums3 = new int[] {1,3,3,4,5};

        int val1 = 3;
        int val2 = 2;
        int val3 = 3;

        System.out.println("====================== Remove Element ==========================================");
        System.out.println("Input: " + Arrays.toString(nums1) + ", " + val1);
        System.out.println("Output = " + removeAllVal(nums1, val1));
        System.out.println("Input: " + Arrays.toString(nums2) + ", " + val2);
        System.out.println("Output = " + removeAllVal(nums2, val2));
        System.out.println("Input: " + Arrays.toString(nums3) + ", " + val3);
        System.out.println("Output = " + removeAllVal(nums3, val3));
        System.out.println("================================================================================");
        System.out.println();
    }

    private static int removeAllVal(int[] nums, int val) {
        int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val) {
                    count++;
                    nums[i] = 0;
                }
            }
        return count;
    }
}
