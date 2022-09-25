package com.bhq;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {

        int values[] = {3, 1, 6, 8, 9, 0, 7, 4, 5, 2};
        System.out.println("原始顺序：" + Arrays.toString(values));
        bubbleSort(values);
        System.out.println("===============================");
        int values1[] = {3, 1, 6, 8, 9, 0, 7, 4, 5, 2};
        bubbleSort2(values1);
    }

    public static void bubbleSort(int values[]) {
        int temp;
        for (int i = 0; i < values.length; i++) {

            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;

                }

            }
            System.out.println((i + 1) + "趟排序" + Arrays.toString(values));

        }

    }

    public static void bubbleSort2(int values[]) {
        int temp;

        for (int i = 0; i < values.length; i++) {
            boolean flag = true;
            for (int j = 0; j < values.length - 1 - i; j++) {

                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
            System.out.println((i + 1) + "趟排序" + Arrays.toString(values));
        }
    }
}

