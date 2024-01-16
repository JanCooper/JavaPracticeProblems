package com.janco.RemoveDuplicatesFromSortedInPlace;

import java.util.*;

public class RemoveDuplicatesFromSortedInPlace {
    // Given an integer array nums sorted in non-decreasing order,
    // remove the duplicates in-place, such that each unique element
    // appears only once. The relative order of the elements should
    // be kept the same. Then return the number of unique elements in nums.

    public static void Call(){
        int[] nums1 = new int[] { 1,1,2 };
        int[] nums2 = new int[] { 0,0,1,1,1,2,2,3,3,4 };
        int[] nums3 = new int[] { 1, 1, 2, 2, 2 };
        int[] nums4 = new int[] { 5,2,6,8,6,7,5,2,8 };
        Arrays.sort(nums4);
        System.out.println("======= Remove Duplicates From Sortted Arrays In Place =========================");
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output = " + String.valueOf(RemoveDuplicatesFromSortedInPlace.SeparateIndexSortInPlace(nums1)));
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output = " + String.valueOf(RemoveDuplicatesFromSortedInPlace.SeparateIndexSortInPlace(nums2)));
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output = " + String.valueOf(RemoveDuplicatesFromSortedInPlace.SeparateIndexSortInPlace(nums3)));
        System.out.println("Input: " + Arrays.toString(nums4));
        System.out.println("Output = " + String.valueOf(RemoveDuplicatesFromSortedInPlace.SeparateIndexSortInPlace(nums4)));
        System.out.println("================================================================================");
        System.out.println();
    }

    private static int SeparateIndexSortInPlace (int[] nums1){
        int length  = nums1.length;
        int k = 0;

        if (length == 0 || length == 1) {
            return length;
        }

        for (int i = 0; i < length - 1; i++) {
            if (nums1[i] != nums1[i + 1]) {
                nums1[k++] = nums1[i];
            }
        }

        nums1[k++] = nums1[length - 1];

        return k;
    }
}
