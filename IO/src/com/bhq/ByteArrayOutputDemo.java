package com.bhq;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = null;


        try {
            StringBuilder sb = new StringBuilder();
            bos = new ByteArrayOutputStream();
            bos.write('a');
            bos.write('b');
            bos.write('c');
            bos.write('d');

            byte arr[] = bos.toByteArray();

            for (int i = 0; i < bos.size(); i++) {
                sb.append((char) arr[i]);

            }
            System.out.println(sb.toString());


        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

}
