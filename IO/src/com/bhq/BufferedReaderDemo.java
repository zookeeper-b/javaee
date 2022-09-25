package com.bhq;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr=new FileReader("d:/a.txt");
            br=new BufferedReader(fr);
            String temp="";
            while ((temp= br.readLine())!=null){
                System.out.println(temp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
