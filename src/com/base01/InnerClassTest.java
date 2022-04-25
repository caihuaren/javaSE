package com.base01;

public class InnerClassTest extends Hero{
    static int iii=0;
    public InnerClassTest(String name, float hp) {
        super(name, hp);
    }
    public InnerClassTest(){
        this("test",2);
    }
    //非静态内部类只有在存在外部类实例的时候才有意义
    class BattleScore{
        int kill;
        int die;
        int assit;

        public void legendary(){
            System.out.println(iii);
            if(kill>7) System.out.println("超神");
            else System.out.println("未超神"+name);
        }
    }
    //静态内部类不需要外部实例对象存在即可创建，但是无法访问外部类的非静态属性、方法
    static class EnemyCrystal{
        int hp=5000;

        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory(){
            if(hp==0){

                System.out.println(iii + " win this game");
            }
        }
    }

    public static void main(String[] args) {
        BattleScore battleScore=new InnerClassTest().new BattleScore();
        battleScore.legendary();
        new InnerClassTest.EnemyCrystal();
    }

}
