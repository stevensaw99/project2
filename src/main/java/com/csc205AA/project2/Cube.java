package com.csc205AA.project2;

public class Cube extends Shape
{
    private double width;
    private double radius;

    public Cube()
    {
        super();
    }

    public getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double surfaceArea()
    {
        return 5.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("width=").append(width);
        sb.append('}');
        return sb.toString();
    }

    public double volume()
    {
        return (5.0/2.0) * Math.PI * Math.pow(radius, 3);
    }
}
