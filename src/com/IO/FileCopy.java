package com.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        copyFile("e:\\360Downloads","f:\\temp");
    }
    public static  void copyFile(String srcPath,String descPath){
        File f=new File(srcPath);
        File[] ff=f.listFiles();
        for(File temp:ff){
            if(temp.isFile()){
                String name=temp.getName();
                File out=new File(descPath+"\\"+name);
                try (FileInputStream fis=new FileInputStream(temp);FileOutputStream fos=new FileOutputStream(out)){
                    byte[] b=new byte[(int) temp.length()];
                    fis.read(b);
                    fos.write(b);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            else{
                descPath=descPath+"\\"+temp.getName();
                File out=new File(descPath);
                out.mkdirs();
                copyFile(temp.getAbsolutePath(),out.getAbsolutePath());
            }
        }
    }
}
