package com.csc205.project2.shapes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    @Test
    void testConstructorAndGetter() {
        Cube cube = new Cube(4);
        assertEquals(4, cube.getSideLength());
    }

    @Test
    void testVolume() {
        Cube cube = new Cube(3);
        assertEquals(27, cube.getVolume(), 0.0001);
    }

    @Test
    void testSurfaceArea() {
        Cube cube = new Cube(3);
        assertEquals(54, cube.getSurfaceArea(), 0.0001);
    }

    @Test
    void testNegativeSideThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Cube(-2));
    }

    @Test
    void testZeroSideThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Cube(0));
    }

    @Test
    void testPolymorphism() {
        Shape3D shape = new Cube(2);
        assertEquals(8, shape.getVolume(), 0.0001);
    }
}
