package com.bhq;

import java.io.*;

public class LineNumberDemo3 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {

            br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/sxt.txt")));
            pw = new PrintWriter("d:/askdb.txt");

            int i = 1;
            String temp = "";


            while ((temp = br.readLine()) != null) {
                pw.println(i + "----" + temp);
                i++;
            }
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null) {
                    pw.close();
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
