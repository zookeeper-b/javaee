package com.bhq;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileSteamBuffer2Demo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("d:/白底照片.jpg");
            fos = new FileOutputStream("d:/bc.jpg");



            //创建缓冲区
            byte buff[] = new byte[fis.available()];
            fis.read(buff);
            fos.write(buff);
            fos.flush();


            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }





}
