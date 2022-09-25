package com.bhq;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("d:/a.txt");


//        System.out.println(f1.createNewFile());
//        System.out.println(f1.delete());
        System.out.println(f1.exists());
        System.out.println(f1.getName());
        System.out.println(f1.equals("abc"));

        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getPath());
        System.out.println(f1.isFile());
        System.out.println(f1.length());
        System.out.println(f1.isHidden());
    }


}
