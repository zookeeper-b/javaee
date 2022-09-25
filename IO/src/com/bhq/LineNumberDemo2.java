package com.bhq;

import java.io.*;

public class LineNumberDemo2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {

            br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/sxt.txt")));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/assd.txt")));
            int i = 1;
            String temp = "";

            while ((temp = br.readLine()) != null) {
                bw.write(i + "," + temp);
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
