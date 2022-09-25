package com.bhq.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckException {
    public static void main(String[] args) {
        FileReader reader=null;
        try {
            reader=new FileReader("d:/a.txt");
            char c=(char) reader.read();
            char c2=(char) reader.read();
            System.out.println(""+c+c2);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("CheckException.main");
            try {
                if (reader!=null){
                    reader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }



}
