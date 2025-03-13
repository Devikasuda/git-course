package com.TechIT.Abstract;

public class Rectangle implements Shape{

    double width;
    double height;

    public Rectangle(){}
    public Rectangle(double width, double height)
    {
        this.height = height;
        this.width = width;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }

    public double pos()
    {
       return 2*(width+height);
    }

    public double aos()
    {
        return width*height;
    }
}
