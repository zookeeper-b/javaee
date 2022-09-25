package com.bhq.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//测试throws声明异常处理方式
public class CheckException03 {
    public static void main(String[] args) throws IOException {
        FileReader reader=null;
        try {
            reader=new FileReader("d:/a.txt");
            char c=(char) reader.read();
            char c2=(char) reader.read();
            System.out.println(""+c+c2);


        } finally {
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
