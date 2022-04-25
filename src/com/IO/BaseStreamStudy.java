package com.IO;

import java.io.*;
import java.util.Arrays;

public class BaseStreamStudy {
    public static void main(String[] args) {
        /*File f=new File("e:/test.txt");
        File ff=new File("d:/xyz/abc/def");
        ff.mkdirs();
        try {
            FileInputStream fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream(new File(ff.getAbsolutePath() + "/lol.txt"));
            byte[] b=new byte[(int)f.length()];
            fis.read(b);
            fos.write(b);
            fis.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }*/
       // FileInputStream fis=new FileInputStream()
        /*try {
            FileOutputStream fos=new FileOutputStream(f);
            byte[] b={33,66};
            fos.write(b);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }*/
        splitFile("D:/IntelliJ IDEA Community Edition 2021.2.1/bin/idea64.exe",10240);
        mergeFile("D:/IntelliJ IDEA Community Edition 2021.2.1/bin/idea64.exe",
                "D:/IntelliJ IDEA Community Edition 2021.2.1/bin/idddeeeaaa.exe",10240);
    }
    public static void splitFile(String path,int size){
        File f=new File(path);
        try {
            FileInputStream fis=new FileInputStream(f);
            byte[] bb=new byte[(int)f.length()];
            byte [] b;
            fis.read(bb);
            FileOutputStream fos;
            for (long i = 0; i < f.length(); i+=size) {
                File outputFile=new File(f.getAbsolutePath()+"-"+i/size);
                fos=new FileOutputStream(outputFile);
                if(i+size<=f.length()){
                    b=new byte[size];
                    System.arraycopy(bb,(int)i,b,0,size);
                    fos.write(b);
                }else {
                    b=new byte[(int)(f.length()-i)];
                    System.arraycopy(bb,(int)i,b,0,(int)(f.length()-i));
                    System.out.println(f.length()-i);
                    fos.write(b);
                }
                fos.close();
            }
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void mergeFile(String path1,String path2,int size){
        byte[] b=new byte[(int)(new File(path1).length())];
        FileInputStream fis;
        for(int i=0;i<b.length;i+=size){
            try {
                File f=new File(path1+"-"+i/size);
                fis=new FileInputStream(f);
                if(i+size<=b.length) {
                    byte[] temp = new byte[size];
                    fis.read(temp);
                    System.arraycopy(temp,0,b,i,temp.length);
                }else {
                    byte[] temp=new byte[b.length-i];
                    System.arraycopy(temp,0,b,i,temp.length);
                }
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos=new FileOutputStream(path2);
            fos.write(b);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
