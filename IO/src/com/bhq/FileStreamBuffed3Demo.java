package com.bhq;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamBuffed3Demo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            fis = new FileInputStream("d:/a.txt");
            bis = new BufferedInputStream(fis);
            fos = new FileOutputStream("d:/b.txt");
            bos = new BufferedOutputStream(fos);

            int t = 0;
            while ((t = bis.read()) != -1) {
                bos.write(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (fis != null) {
                    fis.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (fos != null) {
                    fos.close();
                }


                bos.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

}
