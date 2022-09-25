package com.bhq;

import java.io.File;

public class PrintFileTree {
    public static void main(String[] args) {

        File f=new File(System.getProperty("user.dir"));
        printFile(f,0);

    }

    static void printFile(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        //输出文件名
        System.out.println(file.getName());

        if (file.isDirectory()) {
            File files[] = file.listFiles();
            for (File temp : files) {
                printFile(temp, level+1);


            }

        }


    }


}
