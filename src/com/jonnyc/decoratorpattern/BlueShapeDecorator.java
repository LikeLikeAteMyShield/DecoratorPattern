package com.jonnyc.decoratorpattern;

import com.jonnyc.decoratorpattern.model.Shape;

public class BlueShapeDecorator extends ShapeDecorator{

    public BlueShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){

        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("[BORDER]: Blue");
    }
}
