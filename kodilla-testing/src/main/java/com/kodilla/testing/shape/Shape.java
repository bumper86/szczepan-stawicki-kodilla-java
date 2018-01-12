package com.kodilla.testing.shape;

interface Shape {
    String getShapeName();
    Double getField();
}

class Square implements Shape{
    public String getShapeName() {
        return "Square";
    }


    public Double getField() {
        return 11.0;
    }
}

class Triangle implements Shape{
    public String getShapeName() {
        return "Triangle";
    }


    public Double getField() {
        return 13.4;
    }
}

class Circle implements Shape{
    public String getShapeName() {
        return "Circle";
    }


    public Double getField() {
        return 16.2;
    }
}