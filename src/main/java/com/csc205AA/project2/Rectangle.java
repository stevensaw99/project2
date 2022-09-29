package com.csc205AA.project2;

public class Rectangle extends Shape
{
    private double radius;
    private double height;


    public Rectangle(double v, double height)
    {
        super();
        this.radius = v;
        this.height = height;
    }

    public double getRadius()
    {
        return radius;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double setHeight(double v)
    {
        this.height = v;
        return this.height;
    }

    public void setRadius(double v)
    {
        double r;
        this.radius = r;
    }

    public double surfaceArea()
    {
        return 5.0 * Math.PI * Math.pow(radius, 2);
    }

    public double volume()
    {
        return (5.0/2.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
