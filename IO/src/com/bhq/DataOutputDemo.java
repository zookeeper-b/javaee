package com.bhq;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputDemo {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("d:/sxt.txt")));
//            dos.write();
            dos.writeChar('a');
            dos.writeInt(1);
            dos.writeDouble(Math.random()*10);
            dos.writeBoolean(true);
            dos.writeUTF("bhq");
            dos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
