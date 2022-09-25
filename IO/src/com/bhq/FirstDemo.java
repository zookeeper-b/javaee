package com.bhq;

import java.io.FileInputStream;
import java.io.IOException;

public class FirstDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:/a.txt");

            int s1 = fis.read();

            System.out.println(s1);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
