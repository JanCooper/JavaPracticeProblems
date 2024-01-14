package com.janco.AddTwoNumbers;

import java.util.*;
public class AddTwoNumbers {
    // ADD TWO NUMBERS
    // Given two non-empty linked lists, representing two non-negative integers,
    // with digits stored in reverse order, and each node containing a single digit.
    // Add the two numbers and return the sum as a linked list.
    public static void Call(){
        LinkedList<Integer> threeDigitList1 = new LinkedList<>(Arrays.asList(2,4,3));
        LinkedList<Integer> threeDigitList2 = new LinkedList<>(Arrays.asList(5,6,4));
        LinkedList<Integer> zeroList1 = new LinkedList<>(Arrays.asList(0,0));
        LinkedList<Integer> zeroList2 = new LinkedList<>(Arrays.asList(0,0));
        LinkedList<Integer> sevenDigitList = new LinkedList<>(Arrays.asList(9,9,9,9,9,9,9));
        LinkedList<Integer> fourDigitList = new LinkedList<>(Arrays.asList(9,9,9,9));

        System.out.println("======== Add Two Numbers - 3 digit Arrays ======================================");
        System.out.println("Input: " + threeDigitList1 + ", " + threeDigitList2);
        System.out.println("Output = " + AddTwoNumbers.AddTwo(threeDigitList1, threeDigitList2));
        System.out.println("============== Add Two Numbers - 0 Arrays ======================================");
        System.out.println("Input: " + zeroList1 + ", " + zeroList2);
        System.out.println("Output = " + AddTwoNumbers.AddTwo(zeroList1, zeroList2));
        System.out.println("========== Add Two Numbers - Different Size Arrays =============================");
        System.out.println("Input: " + sevenDigitList + ", " + fourDigitList);
        System.out.println("Output = " + AddTwoNumbers.AddTwo(sevenDigitList, fourDigitList));
        System.out.println("================================================================================");
        System.out.println();
    }

    private static LinkedList<Integer> AddTwo(LinkedList<Integer> inputList1, LinkedList<Integer> inputList2) {
        LinkedList<Integer> output = new LinkedList<>();

        Iterator input1Iterator = inputList1.descendingIterator();
        Iterator input2Iterator = inputList2.descendingIterator();
        int list1Total = 0;
        int list2Total = 0;

        while (input1Iterator.hasNext()) {
            for (Integer i : inputList1) {
                list1Total = 10 * list1Total + i;
                input1Iterator.next();
            }
        }
        while (input2Iterator.hasNext()) {
            for (Integer i : inputList2) {
                list2Total = 10 * list2Total + i;
                input2Iterator.next();
            }
        }
        int total = list1Total + list2Total;

        while (total > 0) {
            output.add(total % 10);
            total = total / 10;
        }
        return output;
    }
}