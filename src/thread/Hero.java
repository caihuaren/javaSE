package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Hero {
    String name;
    float hp;
    AtomicInteger i;
    public Hero(String name,float hp){
        this.name=name;
        this.hp=hp;
        i=new AtomicInteger((int)hp);
        System.out.println(i);
        System.out.println(i.intValue());
    }
    public synchronized void damage(){
        while (hp==1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        hp--;
        System.out.println("减血后的血量为"+hp);
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.notifyAll();
    }
    public synchronized void recover(){
        while (hp==1000) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        hp++;
        System.out.println("加血后的血量为"+hp);
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.notifyAll();
    }

    public void add(){
        i.incrementAndGet();
    }
    public void decrease(){
        i.decrementAndGet();
    }

    public static void main(String[] args) {
        Hero h=new Hero("test",0);
        for (int n = 0; n < 10000; n++) {
            Thread t=new Thread(h::add);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (int n = 0; n < 10000; n++) {
            Thread t=new Thread(h::decrease);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(h.i);
    }
}
