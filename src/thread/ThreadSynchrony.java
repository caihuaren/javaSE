package thread;

public class ThreadSynchrony {
    public static void main(String[] args) throws InterruptedException {
        final Object o=new Object();
        final Hero h=new Hero("test",10086);
        for (int i = 0; i < 10000; i++) {
            Thread t=new Thread(()->{
                synchronized (h) {
                    h.hp++;
                }
            });
            t.start();
        }
        for (int i = 0; i < 10000; i++) {
            Thread t=new Thread(()->{
                synchronized (h) {
                    h.hp--;
                }
            });
            t.start();
        }
        Thread.sleep(1000);
        System.out.println(h.hp);
    }
}
