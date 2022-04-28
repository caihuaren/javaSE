package thread;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindFile {
    public static void findFileByKey(String path,String key){
        File f=new File(path);
        File[] ff=f.listFiles();
        if(ff!=null) {
            for (File file : ff) {
                if(file.isFile()){
                    Thread t= new Thread(() -> {
                        try (FileReader fr = new FileReader(file)) {
                            char[] cc = new char[(int) (file.length())];
                            fr.read(cc);
                            if (new String(cc).contains(key)) System.out.println(file.getAbsolutePath());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    t.start();
                }else {
                    findFileByKey(file.getAbsolutePath(),key);
                }
            }
        }
    }

    public static void main(String[] args) {
        findFileByKey("e:/javaProject","magic");
    }
}
