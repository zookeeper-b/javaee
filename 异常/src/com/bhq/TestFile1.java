package com.bhq;

import java.io.File;
import java.io.IOException;
//创建文件
public class TestFile1 {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        File f=new File("b.txt");

        f.createNewFile();
        f.delete();
        File f2=new File("d:/a.txt");
        f2.createNewFile();
        f2.delete();
        File f3=new File("d:/baihanqi");
       boolean flag=f3.mkdir();
        System.out.println(flag);

    }



}
