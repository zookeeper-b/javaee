package com.bhq;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterDemo {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("d:/ba.txt");
            bw = new BufferedWriter(fw);
            bw.write("我喜欢你");
            bw.newLine();
            bw.write("你好白汉淇");
            bw.newLine();
            bw.write("你好");
            bw.flush();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
