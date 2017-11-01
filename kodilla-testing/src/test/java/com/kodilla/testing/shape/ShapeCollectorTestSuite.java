package com.kodilla.testing.shape;

import org.junit.*;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Circle cr = new Circle();
        //When
        sc.addFigure(cr);
        //Then
        Assert.assertEquals(cr, sc.getFigure(0));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square sq = new Square();
        sc.addFigure(sq);
        //When
        sc.removeFigure(sq);
        //Then
        Assert.assertEquals(sc.shapeList.size() , 0);
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square sq = new Square();
        sc.addFigure(sq);
        //When
        Shape testShape = sc.getFigure(0);
        //Then
        Assert.assertEquals(testShape,sq);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square sq = new Square();
        Circle cr = new Circle();
        Triangle tr = new Triangle();
        //When
        sc.addFigure(sq);
        sc.addFigure(cr);
        sc.addFigure(tr);

        //Then
        Assert.assertEquals(sc.showFigures(),"Square!Circle!Triangle!");
    }
}
