package com.janco.RemoveDuplicatesFromSortedInPlace;

import java.util.*;

public class RemoveDuplicatesFromSortedInPlace_II {
    // Given an integer array nums sorted in non-decreasing order,
    // remove some duplicates in-place such that each unique element
    // appears at most twice. Return the new length of the array.

    // The relative order of the elements should be kept the same.

    public static void Call() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] nums3 = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 5};
        int[] nums4 = new int[]{3, 3};
        System.out.println("========= Remove Duplicates From Sorted Arrays In Place - Two Pointer ==========");
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + (TwoPointersRemoveDuplicatesInPlace(nums1)));
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + (TwoPointersRemoveDuplicatesInPlace(nums2)));
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + (TwoPointersRemoveDuplicatesInPlace(nums3)));
        System.out.println("Input: " + Arrays.toString(nums4));
        System.out.println("Output: " + (TwoPointersRemoveDuplicatesInPlace(nums4)));
        System.out.println("================================================================================");
        System.out.println();

        System.out.println("========== Remove Duplicates From Sorted Arrays In Place - Recursive ===========");
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + (RecursiveRemoveDuplicatesInPlace(nums1)));
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + (RecursiveRemoveDuplicatesInPlace(nums2)));
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + (RecursiveRemoveDuplicatesInPlace(nums3)));
        System.out.println("Input: " + Arrays.toString(nums4));
        System.out.println("Output: " + (RecursiveRemoveDuplicatesInPlace(nums4)));
        System.out.println("================================================================================");
        System.out.println();
    }

    private static int TwoPointersRemoveDuplicatesInPlace(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int slow = 2; // Slow pointer starts from the third element
        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    private static int RecursiveRemoveDuplicatesInPlace(int[] nums) {
        return RecursiveRemoveDuplicatesInPlace(nums, 0, 0, false);
    }

    private static int RecursiveRemoveDuplicatesInPlace(int[] nums, int index, int count, boolean hasDuplicate) {
        if (index >= nums.length) {
            return count;
        }

        if (index > 0 && nums[index] == nums[index - 1]) {
            if (!hasDuplicate) {
                nums[count] = nums[index];
                return RecursiveRemoveDuplicatesInPlace(nums, index + 1, count + 1, true);
            } else {
                return RecursiveRemoveDuplicatesInPlace(nums, index + 1, count, true);
            }
        } else {
            nums[count] = nums[index];
            return RecursiveRemoveDuplicatesInPlace(nums, index + 1, count + 1, false);
        }
    }
}
