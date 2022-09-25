package com.bhq;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DateInputDemo {
    public static void main(String[] args) {
        DataInputStream dis = null;

        try {

            dis = new DataInputStream(new BufferedInputStream(new FileInputStream("d:/sxt.txt")));
            System.out.println("char"+dis.readChar());
            System.out.println("int"+dis.readInt());
            System.out.println("double"+dis.readDouble());
            System.out.println("boolean"+dis.readBoolean());
            System.out.println("String"+dis.readUTF());

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (Exception e) {
            }

        }


    }


}
