package com.kodilla.spring.Shape;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
    @Override
    public String getShapeName() {
       return  "This is a circle";
    }
}
