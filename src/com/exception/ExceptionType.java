package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.management.GarbageCollectorMXBean;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionType {
    public static void main(String[] args) {
        /*File f=new File("d:/test.txt");
        try {
            new FileOutputStream(f);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
            sdf.format(new Date());
            sdf.parse("sd");
        } catch (FileNotFoundException |ParseException e) {
            e.printStackTrace();
        }finally {
            System.out.println("fuck!!!!!!!");
        }
        System.out.println(method());*/
        try {
            method();
        }catch (Throwable e){
            e.printStackTrace();
        }finally {
            System.out.println("??????????");
        }
    }
    public static int method()  throws Throwable{

        while (true){
            method();
        }
    }
}
