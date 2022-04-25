package com.IO;

import java.io.*;

public class ObjectStreamStudy {
    public static void main(String[] args) {
        File f=new File("e:/test.txt");
        Hero[] heroes=new Hero[10];
        for (int i = 0; i < heroes.length; i++) {
            heroes[i]=new Hero("hero"+i,(float)( Math.random()));
            System.out.println(heroes[i]);
        }
        try (FileOutputStream fos=new FileOutputStream(f); ObjectOutputStream oos=new ObjectOutputStream(fos)){
            oos.writeObject(heroes);
        }catch (IOException e){
            e.printStackTrace();
        }try (FileInputStream fis=new FileInputStream(f); ObjectInputStream ois=new ObjectInputStream(fis)){
            heroes=(Hero[])ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        for(Hero h:heroes) System.out.println(h);
    }
}
