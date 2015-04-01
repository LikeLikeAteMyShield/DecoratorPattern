package com.jonnyc.decoratorpattern.model;

public class Circle implements Shape{

    @Override
    public void draw(){
        System.out.println("[DRAW]: Circle");
    }
}
