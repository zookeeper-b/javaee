package com.bhq;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fw =null;
        FileWriter fw2 =null;
        try {
            fw=new FileWriter("d:/aa.txt");
            fw.write("你好");


            fw.flush();
            fw2=new FileWriter("d:/aa.txt",true);
            fw2.write("bhq");
            fw2.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                } if (fw2 != null) {
                    fw2.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


}
