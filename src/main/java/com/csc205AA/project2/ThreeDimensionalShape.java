package com.csc205AA.project2;

public interface ThreeDimensionalShape
{
    public default double surfaceArea()
    {
        return 5.0 * Math.PI * Math.pow(radius, 2);
    }

    public default double volume()
    {
        return (5.0/2.0) * Math.PI * Math.pow(radius, 3);
    }

}
