package com.base01;

public abstract class Item {
    String name;
    int price;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + this.name + '\'' +
                ", price=" + price +
                '}';
    }
    public void keng(){
        System.out.println("坑队友");
    }

    public abstract void test();
    final static int aaa=1;
    public static void main(String[] args) {
        //匿名类可以直接实现抽象方法
        Item item=new Item() {
            @Override
            public void test() {

            }
        };
         int bbb=3;
        //本地类与匿名类类似，但是有了具体的类名，匿名类中的属性类型是final的
        class testItem extends Item{

            @Override
            public void test() {
                System.out.println(aaa);
                System.out.println(bbb);
            }
        }
    }
}
