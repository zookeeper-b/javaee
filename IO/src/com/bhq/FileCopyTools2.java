package com.bhq;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyTools2 {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        try {
            fr=new FileReader("d:/a.txt");
            fw=new FileWriter("d:/b.txt");

            char c[]=new char[1024];

            int t=0;
            while ((t=fr.read(c))!=-1){
                fw.write(c,0,t);

            }
            fw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (fr!=null){
                    fr.close();
                } if (fw!=null){
                    fw.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }







}
