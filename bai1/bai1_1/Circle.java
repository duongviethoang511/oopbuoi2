package oop.bai1_1;

public class Circle {  // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)

    public Circle() {
        radius = 1.0;
        color = "red";
    }


    public Circle(double r) {
        radius = r;
        color = "red";
    }


    public double getRadius() {
        return radius;
    }


    public double getArea() {
        return radius*radius*Math.PI;
    }
}