package thread;

public class ThreadInteraction {
    public static void main(String[] args) throws InterruptedException {
        Hero h=new Hero("test",500);
        for (int i = 0; i < 5; i++) {
            Thread t1=new Thread(() -> {
                while (true) {
                    h.damage();
                    /*try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }*/
                }
            });
            t1.start();
            //t1.join();
       }
        for (int i = 0; i < 3; i++) {
            Thread t2=new Thread(() -> {
                while (true) {
                    h.recover();
                    /*try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }*/
                }
            });
            t2.start();
            //t2.join();
        }
    }

}
