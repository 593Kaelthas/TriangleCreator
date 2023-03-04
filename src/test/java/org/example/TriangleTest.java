package org.example;

import Exceptions.UncreatedTriangle;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class TriangleTest {
    //object creation
    @Test(expected = UncreatedTriangle.class)
    public void testFailedInTriangleCreation() throws UncreatedTriangle {
        Triangle triangle = new Triangle(1.0,2.0,3.0);
    }

    @Test
    public void testSuccessInTriangleCreation() throws UncreatedTriangle {
        Triangle triangle = new Triangle(3.0,5.3,6.0);
        assertNotNull(triangle);
    }
    //verify class methods

    @Test
    public void testTriangleHasValidSides() throws UncreatedTriangle {
        Triangle triangle = new Triangle(4.0,5.0,8.0);
        Assert.assertTrue(triangle.hasValidSides(triangle.getSide1(),triangle.getSide2(),triangle.getSide3()));
    }
    //Verify Triangle Type


    @Test
    public void testEquilateroTriangleType() throws UncreatedTriangle{
        Triangle triangle = new Triangle(2.0,2.0,2.0);
        assertEquals(Triangle.TriangleType.EQUILATERO,triangle.getTriangleType());
    }
    @Test
    public void testIsocelesTriangleType() throws UncreatedTriangle{
        Triangle triangle = new Triangle(2.0,3.0,2.0);
        assertEquals(Triangle.TriangleType.ISOCELES,triangle.getTriangleType());
    }
    @Test
    public void testEscalenoTriangleType() throws UncreatedTriangle{
        Triangle triangle = new Triangle(8.0,5.0,4.0);
        assertEquals(Triangle.TriangleType.ESCALENO,triangle.getTriangleType());
    }
}