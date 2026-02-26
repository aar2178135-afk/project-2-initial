package com.csc205.project2.shapes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PyramidTest {

    @Test
    void testConstructorAndGetters() {
        Pyramid pyramid = new Pyramid(4, 6);
        assertEquals(4, pyramid.getBaseLength());
        assertEquals(6, pyramid.getHeight());
    }

    @Test
    void testVolume() {
        Pyramid pyramid = new Pyramid(4, 6);
        assertEquals((1.0/3.0) * 16 * 6, pyramid.getVolume(), 0.0001);
    }

    @Test
    void testSurfaceArea() {
        Pyramid pyramid = new Pyramid(4, 6);
        assertTrue(pyramid.getSurfaceArea() > 0);
    }

    @Test
    void testNegativeValuesThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Pyramid(-1, 5));
    }

    @Test
    void testPolymorphism() {
        Shape3D shape = new Pyramid(3, 4);
        assertTrue(shape instanceof ThreeDimensionalShape);
    }
}
