package com.kodilla.testing.shape;

interface Shape {
    String getShapeName();
    Double getField();
}

class Square implements Shape{
    private  Double dlugosc;

    public Square(Double dlugosc) {
        this.dlugosc = dlugosc;
        }

    public String getShapeName() {
        return "Square";
    }


    public Double getField() {
        return dlugosc*dlugosc;
    }
}

class Triangle implements Shape{
    private Double dlugosc;
    private Double wysokosc;

    public Triangle(Double dlugosc, Double wysokosc) {
        this.dlugosc = dlugosc;
        this.wysokosc = wysokosc;
    }

    public String getShapeName() {
        return "Triangle";
    }


    public Double getField() {
        return 0.5*dlugosc*wysokosc;
    }
}

class Circle implements Shape{
    private Double promien;

    public Circle(Double promien) {
        this.promien = promien;
    }

    public String getShapeName() {
        return "Circle";
    }


    public Double getField() {
        return 3.14*promien*promien;
    }
}