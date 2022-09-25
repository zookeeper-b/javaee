package com.bhq;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileSteamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis=new FileInputStream("d:/白底照片.jpg");
            fos=new FileOutputStream("d:/a.jpg");
            int t=0;
            while ((t=fis.read())!=-1){
               fos.write(t);
            }
            fos.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis!=null){
                    fis.close();
                }
                if (fos!=null){
                    fos.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }






    }
}
