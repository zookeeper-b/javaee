package com.bhq;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {

        DateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str="2049-10-1 10:10:10";
        Date d1 =format.parse(str);
        System.out.println(d1.getTime());
        System.out.println(d1);
        DateFormat format2=new SimpleDateFormat("yyyy-MM-dd hh时:mm分:ss秒");


        Date d2 =new Date(12312335434324l);
        String d2Str= format2.format(d2);
        System.out.println(d2.getTime());
        System.out.println(d2Str);

        Date now =new Date();
        DateFormat f1=new SimpleDateFormat("今年的第D天,第w周");
        System.out.println(f1.format(now));
    }




}
