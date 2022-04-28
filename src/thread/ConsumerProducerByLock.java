package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConsumerProducerByLock {
    Lock lock=new ReentrantLock();
    Condition condition=lock.newCondition();
    List<Character> list=new ArrayList<>();
    public void push(char c) {
        try {
            lock.lock();
            while (list.size() == 200) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            list.add(c);
            System.out.println(Thread.currentThread().getName() + "压入" + c);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public void pull()  {
        try {
            lock.lock();
            while (list.size() == 0) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + "弹出" + list.remove(list.size() - 1));
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ConsumerProducerByLock cp=new ConsumerProducerByLock();
        for (int i = 0; i < 3; i++) {
            new Thread(()->{
                while (true){
                    cp.push((char)(26*Math.random()+65));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                while (true){
                    cp.pull();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
    }
}
