package com.bhq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyTools3 {
    public static void main(String[] args) {
copyFile("d:/a.txt","d:/dsa.txt");

    }

    public static void copyFile(String src, String des) {

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br=new BufferedReader(new FileReader(src));
            bw=new BufferedWriter(new FileWriter(des));
            String temp="";
            while ((temp= br.readLine())!=null){
                bw.write(temp);
                bw.newLine();
            }

            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

}
