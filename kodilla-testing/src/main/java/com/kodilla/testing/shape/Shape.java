package com.kodilla.testing.shape;
import java.util.ArrayList;

interface Shape {

    String getShapeName();

    void getField();
}

class Square implements Shape {

    public String getShapeName() {
        return "Square!";
    }

    public void getField(){
        System.out.println("a * a");
    }
}

class Triangle implements Shape{

    public String getShapeName(){
        return "Triangle!";
    }

    public void getField(){
        System.out.println("1/2 * a * b");
    }
}

class Circle implements Shape{

    public String getShapeName(){
        return "Circle!";
    }

    public void getField(){
        System.out.println("3,14 * r * r");
    }

}

class ShapeCollector {
    ArrayList<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }
    public void removeFigure(Shape shape){
        shapeList.remove(shape);
    }
    public Shape getFigure(int n){
       return shapeList.get(n);
    }
    public String showFigures(){
        String ak = "";
        for(int n=0; n < shapeList.size(); n++){
            ak = ak + shapeList.get(n).getShapeName();
        }
        return ak;
    }

}