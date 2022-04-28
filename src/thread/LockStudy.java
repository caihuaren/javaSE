package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockStudy {
    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        Condition condition= lock.newCondition();
        Thread t1=new Thread(()->{
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName()+"占有了lock");
                System.out.println("暂时释放lock");
                condition.await();
                System.out.println(Thread.currentThread().getName()+"又占有了lock，嘿嘿");
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });
        t1.start();
        Thread t2=new Thread(()->{
            boolean locked=false;
            try {
                System.out.println(Thread.currentThread().getName()+"尝试占用锁");
                lock.lock();
                System.out.println(Thread.currentThread().getName()+"占用了lock");
                System.out.println(Thread.currentThread().getName()+"释放lock");
                condition.signalAll();
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"再次占用lock！");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                    lock.unlock();
            }
        });
        t2.start();
    }
}
