package com.bhq;

import java.util.Arrays;

public class TestBinarySearch {
    public static void main(String[] args) {
        int arr[] = {30, 20, 50, 10, 20, 9, 7, 12, 100, 40, 8};
        int searchWord = 20;
        Arrays.sort(arr);//二分法查找之前必须对数组进行排序

        System.out.println(Arrays.toString(arr));
        System.out.println(searchWord + "元素的索引" + binarySearch(arr, searchWord));
    }

    public static int binarySearch(int array[], int value) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
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
        return -1;//上面循环完毕，说明未找到，返回-1
    }


}



