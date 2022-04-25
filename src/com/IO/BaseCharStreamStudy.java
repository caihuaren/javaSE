package com.IO;

import java.io.*;

public class BaseCharStreamStudy {
    public static void encodeFile(String originalFilePath,String OutputFilePath){
        File f=new File(originalFilePath);
        try (FileReader fis=new FileReader(originalFilePath);FileWriter fw=new FileWriter(OutputFilePath)){
            char[] c=new char[(int)(f.length())];
            fis.read(c);
            for (int i = 0; i < c.length; i++) {
                if((c[i]>='0'&&c[i]<='8')||(c[i]>='a'&&c[i]<='y'||(c[i]>='A'&&c[i]<='Y'))) c[i]=(char)(c[i]+1);
                else if(c[i]=='9') c[i]='0';
                else if(c[i]=='z') c[i]='a';
                else if(c[i]=='Z') c[i]='A';
            }
            fw.write(c);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        encodeFile("e:/test.txt","e:/encoded.txt");
    }
}
