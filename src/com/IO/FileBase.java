package com.IO;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileBase {
    static String maxFile="",minFile="";
    static long max=Long.MIN_VALUE,min=Long.MAX_VALUE;
    public static void main(String[] args) {
        /*File f=new File("e:/FoxitPhantomPDF.zip");
        System.out.println(f.length());
        System.out.println(new Date(f.lastModified()));
        File ff=new File("e:/fuck.zip");
        f.renameTo(ff);
        System.out.println(f.lastModified());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.isHidden());
        System.out.println(f.getParentFile());
        System.out.println(f.getParent());
        System.out.println(f.getPath());
        System.out.println(Arrays.toString(f.getParentFile().list()));
        System.out.println(f.listRoots());
        f=new File("e:/rr/test/e");
        f.mkdir();
        f.mkdirs();*/
        findExtremeFile("c:/windows");
        System.out.println("maxfile is "+maxFile+" size is "+max);
        System.out.println("minfile is "+minFile+" size is "+min);


    }
    public static void findExtremeFile(String path){
        File f=new File(path);
        System.out.println(f.getAbsolutePath());
        if(f.isDirectory()){
            if(f.listFiles()!=null) {
                for (File ff : f.listFiles()) {
                    if (ff.isFile() && ff.length() != 0) {
                        if (ff.length() > max) {
                            maxFile = ff.getName();
                            max = ff.length();
                        }
                        if (ff.length() < min) {
                            minFile = ff.getName();
                            min = ff.length();
                        }
                    } else if (ff.isDirectory()) findExtremeFile(ff.getAbsolutePath());
                }
            }
        }else {
            if(f.isFile()&&f.length()!=0){
                if(f.length()>max){
                    maxFile=f.getName();
                    max=f.length();
                }if(f.length()<min){
                    minFile=f.getName();
                    min=f.length();
                }
            }
        }
    }
}
