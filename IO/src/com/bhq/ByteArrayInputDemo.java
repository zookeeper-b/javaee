package com.bhq;

import java.io.ByteArrayInputStream;

public class ByteArrayInputDemo {
    public static void main(String[] args) {
        byte arr[] = "asdasd".getBytes();
        ByteArrayInputStream bis = null;
        StringBuilder sb = new StringBuilder();
        try {
            bis = new ByteArrayInputStream(arr);
            int temp = 0;
            while ((temp = bis.read()) != -1) {
                sb.append((char) temp);

            }
            System.out.println(sb.toString());
        } finally {
            try {
                bis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
