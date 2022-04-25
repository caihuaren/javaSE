package com.base01;

import com.exception.DIYException;

public class Hero {
    String name;//姓名
    float hp;//血量
    float armor;//护甲
    int moveSpeed;//移动速度
    static String copyRight="r1";
    public Hero(){
        System.out.println("父类的无参构造方法");
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Hero(String name, float hp){
        System.out.println("父类带两个参数的构造方法");
        this.name=name;
        this.hp=hp;
    }

    public Hero(String name,float hp,float armor,int moveSpeed){
        this(name,hp);

        this.moveSpeed=moveSpeed;
        this.armor=armor;
    }

    public float getArmor(){
        return this.armor;
    }

    public float getHp(){
        return this.hp;
    }

    public void recovery(float blood){
        hp+=blood;
    }

    void addSpeed(int speed){
        this.moveSpeed=moveSpeed+speed;
    }

    public void huixue(int xp){
        this.hp+=xp;
        xp=0;
    }

    public void revive(Hero h){
        h=new Hero("Test",10086);
    }

    public void kill(Mortal m){
        m.die();
    }
    public static void attackHero(Hero h) throws DIYException{
        if(h.hp==0) throw new DIYException(h.name+"dead,no attacking!");
    }
    public static void main(String[] args) {
        /*Hero teemo=new Hero("teemo",100);
        int xp=100;
        teemo.huixue(xp);
        System.out.println(xp);
        teemo.revive(teemo);
        System.out.println(teemo.hp);
        teemo.copyRight="r2";
        System.out.println(new Hero().copyRight);*/
        /*ADHero ad = new ADHero();
        Hero h = ad;
        AD adi = (AD) h;
        APHero ap = (APHero) adi;*/
        /*Hero h1=new Hero();
        h1.kill(new ADHero());
        h1.kill(new APHero());
        h1.kill(new ADAPHero());*/
        Hero h=new Hero();
        h.hp=0;
        try {
            attackHero(h);
        } catch (DIYException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
