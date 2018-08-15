package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void startMessage(){
        System.out.println("Tests start");
    }
    @AfterClass
    public static void endMessage(){
        System.out.println("Tests finished");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        Circle circle = new Circle(2);
        ShapeCollector collector = new ShapeCollector();

        collector.addFigure(circle);

        Assert.assertEquals(circle, collector.getFigure(0));
    }
    @Test
    public void testRemoveFigure(){
        Circle circle = new Circle(2);
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle);
        boolean result = shapeCollector.removeFigure(circle);

        Assert.assertTrue(result);

    }
    @Test
    public void testRemoveNonExistingFigure(){
        Circle circle = new Circle(2);
        ShapeCollector shapeCollector = new ShapeCollector();

        boolean result = shapeCollector.removeFigure(circle);

        Assert.assertFalse(result);

    }
    @Test
    public void testGetFigure(){
        Circle circle = new Circle(3);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(4));
        shapeCollector.addFigure(circle);

        Assert.assertEquals(circle, shapeCollector.getFigure(1));
    }
    @Test
    public void testShowFigures(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2,4);
        Square square = new Square(3);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        String testCase = circle.getShapeName()+" with area of: "+circle.getField()+"/n"+
                square.getShapeName()+" with area of: "+square.getField()+"/n"+
                triangle.getShapeName()+" with area of: "+triangle.getField()+"/n";
        Assert.assertEquals(testCase, shapeCollector.showFigures());
    }

}
