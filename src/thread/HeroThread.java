package thread;

import com.base01.Hero;

class HeroThread{
    Hero h1;
    Hero h2;
    public HeroThread(Hero h1,Hero h2){
        this.h1=h1;
        this.h2=h2;
    }

    public static void main(String[] args) {
        HeroThread heroThread=new HeroThread(new Hero("h1",1,1),new Hero("h2",1,1));
        Thread thread=new Thread(()->{
                while (heroThread.h1.hp>0) {
                    heroThread.h1.hp -= heroThread.h2.damage;
                    System.out.println(heroThread.h1.hp);
                }
            }
        );
        thread.start();
    }

}