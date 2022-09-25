package com.bhq;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamBuffedDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("d:/白底照片.jpg");
            fos = new FileOutputStream("d:/cc.jpg");
            int t = 0;

            //创建缓冲区
            byte buff[] = new byte[1024];

            while ((t = fis.read(buff)) != -1) {
                fos.write(buff, 0, t);
//                fos.write(t);
            }
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
