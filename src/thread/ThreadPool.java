package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    List<Runnable> list=new ArrayList<>();
    int poolSize;
    public  ThreadPool(){
        poolSize=10;
        for (int i = 0; i < poolSize; i++) {
            CustomThread thread=new CustomThread("thread-"+i);
            thread.start();
        }
    }

    public void add(Runnable r){
        synchronized (list) {
           /* while (list.size()==poolSize) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }*/
            System.out.println("添加任务");
            list.add(r);
            list.notifyAll();
        }
    }
    class CustomThread extends Thread{
        public CustomThread(String name){
            super(name);
        }
       // Runnable r;
        @Override
        public void run() {
            synchronized (list){
                while (true) {
                    while (list.size() == 0) {
                        try {
                            list.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    Runnable r = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + "执行了任务");
                    new Thread(r).start();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    list.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadPool threadPool=new ThreadPool();
        for (int i = 0; i < 100; i++) {
            threadPool.add(()->{
                System.out.println(Math.random());
            });
        }
        ThreadPoolExecutor executor=new ThreadPoolExecutor(10,15,60, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());

    }
}
