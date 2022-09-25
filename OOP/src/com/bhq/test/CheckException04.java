package com.bhq.test;

import java.io.FileReader;

public class CheckException04 {


    public static void main(String[] args) {

        try ( FileReader reader=new FileReader("d:/a.txt");){
            char c=(char) reader.read();
            char c2=(char) reader.read();
            System.out.println(""+c+c2);

        }catch (Exception e){
            e.printStackTrace();
        }











    }






}
