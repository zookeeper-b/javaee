package com.bhq;
import java.util.Arrays;
//测试多维数组初始化
public class Test06 {
    public static void main(String[] args) {


        int a[][] = new int[3][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];

        a[0][0] = 100;
        a[0][1] = 200;


        int b[][] = {{1, 2, 3}, {3, 4}, {3, 5, 6, 7}};
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));
        System.out.println(Arrays.toString(b[2]));
        System.out.println(b[1][1]);
        System.out.println("``````````````````");
        int c [][]=new int[3][];
        c[0]=new int[]{1,2,3};
        c[1]=new int[]{2,3};
        c[2]=new int[]{2,3,4};
        System.out.println(c[2][2]);
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(c[1]));
        System.out.println(Arrays.toString(c[2]));
    }
}
