package thread;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ConsumerProducerTest {
    Deque<Character> list=new LinkedList<>();
    public synchronized void push(char c){
        while (list.size()==200) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        list.add(c);
        System.out.println(Thread.currentThread().getName()+"压入"+c);
        this.notifyAll();
    }
    public synchronized void poll(){
        while (list.size()==0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+"弹出"+list.removeLast());
        this.notifyAll();
    }
    static Object o=new Object();
    static int a=1;

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (o) {
                while (a <= 10) {
                    if (a % 2 != 1) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if(a<=10) {
                        System.out.println(Thread.currentThread().getName() + "print:" + a);
                        a++;
                        o.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(()->{
            synchronized (o) {
                while (a <= 10) {
                    if (a % 2 == 1) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"print:"+a);
                    a++;
                    o.notifyAll();
                }
            }
        }).start();
        /*ConsumerProducerTest test=new ConsumerProducerTest();
        for (int i = 0; i < 3; i++) {
            new Thread(()->{
                while (true){
                    test.push((char)(Math.random()*26+65));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                while (true){
                    test.poll();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }*/
    }
}
