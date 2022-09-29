package com.csc205AA.project2;


import java.util.ArrayList;
import java.util.List;



public class Project2
{
    /**
     * Driver for project 2.
     *
     * Modify the driver as needed to demonstrate your classes.
     *
     */
    public static void main(String[] args)
        {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = new Sphere(4.0);

        ThreeDimensionalShape cube = new Cube(7.0);

        ThreeDimensionalShape rectangle = new Rectangle(5.0, 2.0);
        // We'll cover this stuff in module 4

        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);

        shapes.add(cube);

        shapes.add(rectangle);

        shapes.forEach(System.out::println);
        shapes.forEach(System.out::println);

            Sphere sphere = new Sphere(4.0);
            System.out.println(sphere);

            Cube cube = new Cube(7.0);
            System.out.println(cube);

            Rectangle rectangle = new Rectangle(5.0, 2.0);
            System.out.println(rectangle);



        }

    }

