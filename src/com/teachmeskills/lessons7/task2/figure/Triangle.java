package com.teachmeskills.lessons7.task2.figure;

public class Triangle extends Figure{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     *
     * @return area of triangle , p - semiperimeter
     */
    @Override
    public double getAreaOfFigure() {
        double p = (a + b + c) / 2;
        return Math.sqrt( p * (p - a) * (p - b) * (p - c) );
    }

    /**
     *
     * @return perimeter of triangle, a,b,c - sides of a triangle
     */
    @Override
    public double getPerimeterOfFigure() {
        return a + b + c;
    }
}
