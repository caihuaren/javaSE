package com.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CacheStream {
    public static void main(String[] args) {
        /*File f=new File("e:/test.txt");
        try(FileWriter fw=new FileWriter(f);PrintWriter pw=new PrintWriter(fw)){
            pw.println("test");
            pw.println("!!!!!");
            pw.println("ohhhhh");
        }catch (IOException e){
            e.printStackTrace();
        }
        try (FileReader fr=new FileReader(f); BufferedReader br=new BufferedReader(fr)){
            String str;
            while (true){
                str=br.readLine();
                if(str==null) break;
                System.out.println(str);
            }
        }catch (IOException e){
         */
        removeComment("e:/test.txt");
    }
    public static void removeComment(String path){
        List<String> list=new ArrayList<>();
        File f=new File(path);
        try(FileReader fr=new FileReader(f);BufferedReader br=new BufferedReader(fr)){
            String str;
            while (true){
                str=br.readLine();
                if(str==null) break;
                System.out.println(str);
                if(!str.startsWith("//")) list.add(str);
            }
            System.out.println(list);
        }catch (IOException e){
            e.printStackTrace();
        }
        try(FileWriter fw=new FileWriter(f);PrintWriter pw=new PrintWriter(fw)){
            for(String ss:list) pw.println(ss);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
