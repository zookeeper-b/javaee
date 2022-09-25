package com.bhq;
//测试object[][]二维数组存储表格数据
import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        Object[] a1 = {01, "白汉淇", 18, "教授1", "9-9"};
        Object[] a2 = {02, "白小黑", 20, "教授2", "19-9"};
        Object[] a3 = {03, "白二黑", 22, "教授3", "29-9"};
        Object[][] emps = new Object[3][];
        emps[0] = a1;
        emps[1] = a2;
        emps[2] = a3;
        System.out.println(Arrays.toString(emps[0]));
        System.out.println(Arrays.toString(emps[1]));
        System.out.println(Arrays.toString(emps[2]));
        System.out.println("!!!!!!!!!!!!!!!!!");
        for (int i=0;i<emps.length;i++){
            for (int j=0;j<emps[i].length;j++){
                System.out.print(emps[i][j]+"\t");
            }
            System.out.println("");

        }

    }


}
