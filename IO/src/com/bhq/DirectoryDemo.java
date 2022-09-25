package com.bhq;

import java.io.File;

public class DirectoryDemo {
    public static void main(String[] args) {
        File file=new File("d:/bhq/a/b/c/d");
//        System.out.println(file.mkdir());
//        System.out.println(file.mkdirs());
//
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getParentFile().getName());
        System.out.println(file.getParent());
        System.out.println();

        File file1=new File("d:/");
        String ayy[]= file1.list();
        for (String str:ayy
             ) {
            System.out.println(str);
        }
        System.out.println();
        File  ayy2[]= file1.listFiles();
        for (File temp:ayy2
             ) {
            System.out.println(temp);
        }


    }


}
