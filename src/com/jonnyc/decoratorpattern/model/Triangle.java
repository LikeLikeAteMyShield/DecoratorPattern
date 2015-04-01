package com.jonnyc.decoratorpattern.model;

public class Triangle implements Shape{

    @Override
    public void draw(){
        System.out.println("[DRAW]: Triangle");
    }
}
