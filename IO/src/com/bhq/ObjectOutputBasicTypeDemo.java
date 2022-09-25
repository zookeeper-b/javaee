package com.bhq;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputBasicTypeDemo {
    public static void main(String[] args) {
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("d:/sxt.txt")));
            oos.writeInt(10);
            oos.writeDouble(Math.random());
            oos.writeChar('a');
            oos.writeBoolean(true);
            oos.writeUTF("bhqlxy");
            oos.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(oos!=null){
                    oos.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }




    }
}
