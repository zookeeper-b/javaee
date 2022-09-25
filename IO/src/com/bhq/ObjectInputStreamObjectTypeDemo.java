package com.bhq;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamObjectTypeDemo {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("d:/bhq.txt"));
            User user = (User) ois.readObject();
            System.out.println((int) user.getUserid() + user.getUsername() + user + (int) user.getUserage());
            System.out.println("-----------");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
