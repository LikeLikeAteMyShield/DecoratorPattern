package com.jonnyc.decoratorpattern.model;

public class Square implements Shape{

    @Override
    public void draw(){
        System.out.println("[DRAW]: Square");
    }
}
