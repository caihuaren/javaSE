package com.exception;

public class OverdraftException extends Exception{
    public OverdraftException(){}
    public OverdraftException(String msg){
        super(msg);
    }
}
