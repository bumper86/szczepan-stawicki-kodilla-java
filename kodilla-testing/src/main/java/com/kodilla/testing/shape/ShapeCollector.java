package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }
    public int getFiguresQuantity(){
        return shapes.size();
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n<shapes.size()){
            shape = shapes.get(n);
        }
        return shape;
    }

    public String showFigures() {
        String figures = "";
        for (int i = 0; i < shapes.size(); i++){
            figures = figures + shapes.get(i).getShapeName();
        }
        return figures;
    }

}
