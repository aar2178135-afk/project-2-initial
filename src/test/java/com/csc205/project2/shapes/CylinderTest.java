package com.csc205.project2.shapes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void testConstructorAndGetters() {
        Cylinder cylinder = new Cylinder(3, 5);
        assertEquals(3, cylinder.getRadius());
        assertEquals(5, cylinder.getHeight());
    }

    @Test
    void testVolume() {
        Cylinder cylinder = new Cylinder(2, 4);
        assertEquals(Math.PI * 4 * 4, cylinder.getVolume(), 0.0001);
    }

    @Test
    void testSurfaceArea() {
        Cylinder cylinder = new Cylinder(2, 4);
        double expected = 2 * Math.PI * 2 * (2 + 4);
        assertEquals(expected, cylinder.getSurfaceArea(), 0.0001);
    }

    @Test
    void testNegativeValuesThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Cylinder(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> new Cylinder(1, -5));
    }

    @Test
    void testPolymorphism() {
        Shape3D shape = new Cylinder(2, 4);
        assertTrue(shape.getVolume() > 0);
    }
}
