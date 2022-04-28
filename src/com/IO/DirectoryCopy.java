package com.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DirectoryCopy {
    public static void copyFile(String path1,String path2){
        File f=new File(path1);
        File[] ff=f.listFiles();
        if(ff!=null){
            for (File file : ff) {
                if(file.isFile()){
                    new File(path2).mkdirs();
                    File temp=new File(path2+"\\"+file.getName());
                    try(FileInputStream fis=new FileInputStream(file); FileOutputStream fos=new FileOutputStream(temp)){
                        byte[] b=new byte[1024];
                        while (fis.read(b)!=-1){
                            fos.write(b);
                            fos.flush();
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }else {
                    File temp=new File(path2+"\\"+file.getName());
                    temp.mkdirs();
                    copyFile(file.getAbsolutePath(),temp.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {
        copyFile("E:\\360Downloads","f:\\test");
    }
}
