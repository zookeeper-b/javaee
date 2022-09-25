package com.bhq;

import java.util.Arrays;

/**
 * @author bhq
 * @date 2022/9/24--11:36
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};
        int searchWord = 20;//所要查找的数
        Arrays.sort(arr);

        System.out.println(searchWord + "元素的索引:" + binarySearch(arr, searchWord));

    }

    private static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (value == array[middle]) {
                return middle;
            }
            if (value > array[middle]) {
                low = middle + 1;
            }
            if (value < array[middle]) {
                high = middle - 1;
            }
        }
        return -1;
    }
}



