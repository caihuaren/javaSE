package com.IO;

import java.io.*;

public class DataStreamStudy {
    public static void main(String[] args) {
        File f=new File("e:/test.txt");
        try (FileOutputStream fos=new FileOutputStream(f); DataOutputStream dos=new DataOutputStream(fos)){
            dos.writeBoolean(true);
            dos.writeUTF("fuck!!!!");
            dos.writeChar(88);
            dos.writeInt(33);
            dos.writeInt(66);
        }catch (IOException e){
            e.printStackTrace();
        }
        try (FileInputStream fis=new FileInputStream(f);DataInputStream dis=new DataInputStream(fis)){
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readInt());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
