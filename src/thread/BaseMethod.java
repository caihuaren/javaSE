package thread;

import java.util.ArrayList;
import java.util.List;

public class BaseMethod {
    public static void main(String[] args) {

        /*Thread t1=new Thread(
            ()->{
                try {
                    Thread.sleep(1000);
                    System.out.println("!!!");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        );
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("???");
        new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };*/
        /*new Thread(()->{
            while (true){
                for (int i = 0; i < 3; i++) {
                    System.out.println("波动拳第"+(i+1)+"发");
                    if(i!=3) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                System.out.println("充能5秒");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();*/
        getAllRes("aB1");
    }
    public static void getAllRes(String s){
        List<String> list=new ArrayList<>();
        loop:
        for (int i = 0; i < 123; i++) {
            for (int j = 0; j < 123; j++) {
                for (int k = 0; k < 123; k++) {
                    String ss=new String(new char[]{(char)i,(char) j,(char) k});
                    list.add(ss);
                    //System.out.println("ss="+ss);
                    if(s.equals(ss)) break loop;
                }
            }
        }
        Thread thread=new Thread(()->{
            while (true) {
                while (list.isEmpty()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                String temp=list.remove(0);
                if(list.size()%1000==0) System.out.println(temp);
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
}
