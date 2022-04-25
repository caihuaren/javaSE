package com.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandardInputStudy {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("输入类名");
        String className=in.nextLine();
        System.out.println("输入参数类型");
        String type=in.nextLine();
        System.out.println("输入参数名");
        String paramName=in.nextLine();
        String Uproperty=Character.toUpperCase(paramName.charAt(0))+paramName.substring(1);
        File f=new File("e:/test.txt");
        try (FileReader fr=new FileReader(f); BufferedReader br=new BufferedReader(fr)){
            String str;
            while (true){
                str=br.readLine();
                if(str==null)  break;
                str=str.replaceAll("@class@",className);
                str=str.replaceAll("@type@",type);
                str=str.replaceAll("@property@",paramName);
                str=str.replaceAll("@Uproperty@",Uproperty);
                System.out.println(str);
                list.add(str);
            }
        }catch (IOException e){e.printStackTrace();}
        System.out.println("替换后的内容");
        try (FileWriter fw=new FileWriter(f);PrintWriter pw=new PrintWriter(fw)){
            for(String s:list) pw.println(s);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
