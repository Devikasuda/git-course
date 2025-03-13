package com.TechIT.Abstract;

public class Circle implements Shape {
    double radius;

    public Circle(){}
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double pos()
    {
        return 2*PI*radius;
    }

    public double aos()
    {
        return PI*radius*radius;
    }

}
