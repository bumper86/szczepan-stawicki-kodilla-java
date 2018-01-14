package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("This is the beginning of the test.");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("All test are finished.");
    }

    @Before
    public void beforeAlltest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(3.0);

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1,shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(4.5);
        shapeCollector.addFigure(circle);

        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle,retrievedShape);
    }

    @Test
    public void testRemove() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(4.2);
        shapeCollector.addFigure(circle);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(6.7);
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(2.0, 6.0);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        String expected = "CircleTriangleSquare";

        //When
        String result = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(expected,result);
    }
}
