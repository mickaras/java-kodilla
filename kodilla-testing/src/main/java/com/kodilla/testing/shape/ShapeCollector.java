package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape){
        if(shapes.contains(shape)){
            shapes.remove(shape);
            return true;
        }
        return false;
    }
    public Shape getFigure(int n){
        return shapes.get(n);
    }
    public String showFigures(){
        String stringContainer="";
        for(Shape shape:shapes){
            stringContainer +=shape.getShapeName()+" with area of: "+shape.getField()+"/n";
        }

        return stringContainer;
    }
}
