package com.csc205.project2.shapes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SphereTest {

    // -------- Basic Functionality --------
    @Test
    void testConstructorAndGetter() {
        Sphere sphere = new Sphere(5);
        assertEquals(5, sphere.getRadius());
    }

    @Test
    void testSetter() {
        Sphere sphere = new Sphere(2);
        sphere.setRadius(4);
        assertEquals(4, sphere.getRadius());
    }

    // -------- Calculation Accuracy --------
    @Test
    void testVolumeCalculation() {
        Sphere sphere = new Sphere(3);
        double expected = (4.0 / 3.0) * Math.PI * 27;
        assertEquals(expected, sphere.getVolume(), 0.0001);
    }

    @Test
    void testSurfaceAreaCalculation() {
        Sphere sphere = new Sphere(3);
        double expected = 4 * Math.PI * 9;
        assertEquals(expected, sphere.getSurfaceArea(), 0.0001);
    }

    // -------- Boundary Testing --------
    @Test
    void testVerySmallRadius() {
        Sphere sphere = new Sphere(0.0001);
        assertTrue(sphere.getVolume() > 0);
    }

    @Test
    void testVeryLargeRadius() {
        Sphere sphere = new Sphere(1_000_000);
        assertTrue(sphere.getVolume() > 0);
    }

    // -------- Input Validation --------
    @Test
    void testNegativeRadiusThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Sphere(-5);
        });
    }

    @Test
    void testZeroRadiusThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Sphere(0);
        });
    }

    // -------- Inheritance Testing --------
    @Test
    void testPolymorphism() {
        Shape3D shape = new Sphere(3);
        assertTrue(shape instanceof ThreeDimensionalShape);
        assertEquals((4.0 / 3.0) * Math.PI * 27, shape.getVolume(), 0.0001);
    }
}
