package com.bhq;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamObjectTypeDemo {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream((new FileOutputStream("d:/bhq.txt")));
            User user = new User(1, "bhq", 22);
            oos.writeObject(user);
            oos.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
