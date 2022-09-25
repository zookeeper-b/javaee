package com.bhq;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo{
    public static void main(String[] args) {
        RandomAccessFile raf=null;
        try {
            raf=new RandomAccessFile("d:/bhq.txt","rw");
            int arr[]=new int[]{10,20,30,40,50,100};
            for (int i=0;i<arr.length;i+=2){
                raf.writeInt(arr[i]);

            }


            for (int i=0;i<5;i++){
                raf.seek(i*4);
                System.out.print(raf.readInt()+"\t");

            }
            System.out.println();
            raf.seek(8);
            raf.writeInt(45);

            for (int i=0;i<5;i++){
                raf.seek(i*4);
                System.out.print(raf.readInt()+"\t");

            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(raf!=null){
                    raf.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }






    }
}
