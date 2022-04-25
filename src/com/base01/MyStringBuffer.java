package com.base01;

import com.exception.DIYException;

public class MyStringBuffer implements IStringBuffer{
    int length=0;
    int capacity=12;
    char[] cc=new char[capacity];
    @Override
    public void append(String str) {
        if(str.length()+length>capacity){
            capacity=(int)((str.length()+length)*1.5);
            char[] temp=new char[capacity];
            System.arraycopy(cc,0,temp,0,length);
            System.arraycopy(str.toCharArray(),0,temp,length,str.length());
            cc=temp;
        }
        else {
            System.arraycopy(str.toCharArray(),0,cc,length,str.length());
        }
        length+=str.length();

    }

    @Override
    public String toString() {
        String res="";
        for (int i = 0; i < length; i++) {
            res+=cc[i];
        }
        return res;
    }

    @Override
    public void append(char c) {
        append(String.valueOf(c));
    }

    @Override
    public void insert(int pos, char b) throws DIYException{
        insert(pos,String.valueOf(b));
    }

    @Override
    public void insert(int pos, String b) throws DIYException{
        if(pos<0){
            throw new DIYException("下标不能小于0！");
        }
        if(capacity<length+b.length()){
            capacity=(int)((length+b.length())*1.5);

        }
        char[] temp=new char[capacity];
        System.arraycopy(cc,0,temp,0,pos);
        System.arraycopy(b.toCharArray(),0,temp,pos,b.length());
        System.arraycopy(cc,pos,temp,pos+b.length(),cc.length-pos);
        cc=temp;
        length+=b.length();
    }

    @Override
    public void delete(int start) {
        char[] temp=new char[capacity];
        System.arraycopy(cc,0,temp,0,start);
        cc=temp;
        length=start;
    }

    @Override
    public void delete(int start, int end) {
        char[] temp=new char[capacity];
        System.arraycopy(cc,0,temp,0,start);
        System.arraycopy(cc,end,temp,start,length-end);
        cc=temp;
        length=length+start-end;
    }

    @Override
    public void reverse() {
        for (int i = 0; i < length / 2; i++) {
            char temp=cc[i];
            cc[i]=cc[length-i-1];
            cc[length-i-1]=temp;
        }
    }

    @Override
    public int length() {
        return length;
    }

    public static void main(String[] args) {
        MyStringBuffer myStringBuffer=new MyStringBuffer();
        myStringBuffer.append("sdfsdg");
        System.out.println(myStringBuffer);
        System.out.println(myStringBuffer.length());
        try {
            myStringBuffer.insert(-1, "sdfsgrfdgfdgdsfgdfffffffffff");
        }catch (DIYException e){
            e.printStackTrace();
        }
        System.out.println(myStringBuffer);
        System.out.println(myStringBuffer.length());
        myStringBuffer.delete(3,5);
        System.out.println(myStringBuffer);
    }
}

