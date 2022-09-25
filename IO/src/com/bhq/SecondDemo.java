package com.bhq;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SecondDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:/a.txt");
            StringBuilder sb=new StringBuilder();
            int temp = 0;
            while ((temp = fis.read()) != -1) {
                System.out.println(temp);
                sb.append((char)temp);
            }
            System.out.println("-------");
            System.out.println(sb.toString());

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
