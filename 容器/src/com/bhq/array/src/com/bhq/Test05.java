package com.bhq;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {
//        int a[]={1,2};
//          排序sort.
//          查找binarySearch.
//          填充fill
//        for(int i:a){
//            System.out.println(a);
//            System.out.println(Arrays.toString(a));
        int a[] = {1, 2, 434, 3, 324, 234, 23, 34};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //返回排序后的新的索引位置，若未找到返回负数
        System.out.println("改元素的索引" + Arrays.binarySearch(a, 3));
        Arrays.fill(a,2,4,100);
        System.out.println(Arrays.toString(a));
        }

}



