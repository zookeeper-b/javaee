package com.bhq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class LineNumberDemo {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("d:/ba.txt"));
            bw = new BufferedWriter(new FileWriter("d:/sxt.txt"));
            String tmep = "";
            int i = 1;
            while ((tmep = br.readLine()) != null) {
                bw.write(i + "" + tmep);
                bw.newLine();
                i++;

            }
            bw.flush();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
