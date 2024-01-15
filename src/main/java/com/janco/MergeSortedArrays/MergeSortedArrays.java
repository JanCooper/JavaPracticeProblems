package com.janco.MergeSortedArrays;

import java.util.*;
public class MergeSortedArrays {
    // MERGE SORTED ARRAYS
    // You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    // and two integers m and n, representing the number of elements in nums1 and nums2
    // respectively.
    // Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    public static void Call(){
        int[] nums1 = new int[] { 1, 3, 4, 5 };
        int[] nums2 = new int[] { 2, 4, 6, 8 };
        int[] array3 = new int[] { 1, 5, 9, 10, 15, 20 };
        int[] array4 = new int[] { 2, 3, 8, 13 };
        System.out.println("======= Merge Two Sorted Arrays Brute Force ====================================");
        System.out.println("Input: " + Arrays.toString(nums1) + ", " + Arrays.toString(nums2));
        System.out.println("Output = " + Arrays.toString(MergeSortedArrays.bruteForceMergeThenSort(nums1, nums2, nums1.length, nums2.length)));
        System.out.println("======= Merge Two Sorted Arrays Merge Sort =====================================");
        System.out.println("Input: " + Arrays.toString(nums1) + ", " + Arrays.toString(nums2));
        System.out.println("Output = " + Arrays.toString(MergeSortedArrays.mergeSort(nums1, nums2, nums1.length, nums2.length)));
        System.out.println("Input: " + Arrays.toString(array3) + ", " + Arrays.toString(array4));
        System.out.println("Output = " + Arrays.toString(MergeSortedArrays.mergeSort(array3, array4, array3.length, array4.length)));
        System.out.println("================================================================================");
        System.out.println();
    }

    // MERGE SORTED ARRAYS NO EXTRA SPACE
    // You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    // and two integers m and n, representing the number of elements in nums1 and nums2
    // respectively.
    // Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    // The function should return nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
    public static void Call_NoExtraSpace() {
        int[] array5 = new int[] { 1,2,3,0,0,0 };
        int[] array6 = new int[] { 2,5,6 };
        int[] array7 = new int[] { 0 };
        int[] array8 = new int[] { 1 };
        System.out.println("======= Merge Two Sorted No Extra Space ========================================");
        System.out.println("Input: " + Arrays.toString(array5) + ", " + Arrays.toString(array6));
        System.out.println("Output = " + Arrays.toString(MergeSortedArrays.ShellSortNoExtraSpace(array5, array6, array5.length, array6.length)));
        System.out.println("Input: " + Arrays.toString(array7) + ", " + Arrays.toString(array8));
        System.out.println("Output = " + Arrays.toString(MergeSortedArrays.ShellSortNoExtraSpace(array7, array8, array7.length, array8.length)));
        System.out.println("================================================================================");
        System.out.println();
    }

    private static int[] bruteForceMergeThenSort(int[] nums1, int[] nums2, int length1, int length2){
        int length3 = length1 + length2;
        int[] array3 = new int[length3];
        int k = 0;

        for(int i = 0; i < length1; i++){
            array3[k] = nums1[i];
            k++;
        }
        for(int i = 0; i < length2; i++){
            array3[k] = nums2[i];
            k++;
        }

        Arrays.sort(array3);
        return array3;
    }

    private static int[] mergeSort (int[] nums1, int[] nums2, int length1, int length2){
        int length3 = length1 + length2;
        int[] array3 = new int[length3];
        int i = 0, j = 0, k = 0;

        while (i < length1 && j < length2) {
            if (nums1[i] < nums2[j]) {
                array3[k++] = nums1[i++];
            } else {
                array3[k++] = nums2[j++];
            }

            while (i < length1) {
                array3[k++] = nums1[i++];
            }
            while (j < length2) {
                array3[k++] = nums2[j++];
            }
        }
        Arrays.sort(array3);
        return array3;
    }

    private static int[] ShellSortNoExtraSpace (int[] nums1, int[] nums2, int length1, int length2){
        int left = length1 > 1 ? length1 - 1 : 0 ;
        int right = 0;
        int swap;

        while (left >= 0){
            if(nums1[left] < nums2[right]) {
                swap = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = swap;
                left--;
                right++;

                if (right == length2) {
                    right = 0;
                }
            } else {
                break;
            }
        }

        Arrays.sort(nums1);
        return nums1;
    }
}
