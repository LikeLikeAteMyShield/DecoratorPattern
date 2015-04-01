package com.jonnyc.decoratorpattern;

import com.jonnyc.decoratorpattern.model.Circle;
import com.jonnyc.decoratorpattern.model.Shape;
import com.jonnyc.decoratorpattern.model.Square;
import com.jonnyc.decoratorpattern.model.Triangle;

public class Demo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redTriangle = new RedShapeDecorator(new Triangle());
        Shape blueSquare = new BlueShapeDecorator(new Square());

        circle.draw();
        redTriangle.draw();
        blueSquare.draw();
    }
}
