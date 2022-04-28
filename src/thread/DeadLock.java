package thread;

public class DeadLock {
    public static void main(String[] args) {
        Hero h1=new Hero("q",1);
        Hero h2=new Hero("p",2);
        Hero h3=new Hero("oo",2);

        new Thread(()->{
           synchronized (h1){
               System.out.println(Thread.currentThread()+"占有了"+h1.name);
               System.out.println(Thread.currentThread()+"试图占有"+h2.name);
                synchronized (h2){
                    System.out.println("已经占有"+h2.name);
                }
           }
        }).start();
        new Thread(()->{
            synchronized (h2){
                System.out.println(Thread.currentThread()+"占有了"+h2.name);
                System.out.println(Thread.currentThread()+"试图占有"+h3.name);
                synchronized (h3){
                    System.out.println("已经占有"+h3.name);
                }
            }
        }).start();
        new Thread(()->{
            synchronized (h3){
                System.out.println(Thread.currentThread()+"占有了"+h3.name);
                System.out.println(Thread.currentThread()+"试图占有"+h1.name);
                synchronized (h1){
                    System.out.println("已经占有"+h1.name);
                }
            }
        }).start();
    }
}
