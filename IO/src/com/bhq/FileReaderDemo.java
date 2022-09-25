package com.bhq;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader frd = null;
        try {
            frd = new FileReader("d:/a.txt");
            int t=0;
            while ((t=frd.read())!=-1){
                System.out.println(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (frd != null) {
                    frd.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

}
