package com.csc205.project2.shapes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangularPrismTest {

    @Test
    void testConstructorAndGetters() {
        RectangularPrism prism = new RectangularPrism(2, 3, 4);
        assertEquals(2, prism.getLength());
        assertEquals(3, prism.getWidth());
        assertEquals(4, prism.getHeight());
    }

    @Test
    void testVolume() {
        RectangularPrism prism = new RectangularPrism(2, 3, 4);
        assertEquals(24, prism.getVolume(), 0.0001);
    }

    @Test
    void testSurfaceArea() {
        RectangularPrism prism = new RectangularPrism(2, 3, 4);
        assertEquals(52, prism.getSurfaceArea(), 0.0001);
    }

    @Test
    void testNegativeInputThrowsException() {
        assertThrows(IllegalArgumentException.class, () ->
                new RectangularPrism(-1, 2, 3));
    }

    @Test
    void testPolymorphism() {
        Shape3D shape = new RectangularPrism(1, 2, 3);
        assertEquals(6, shape.getVolume(), 0.0001);
    }
}
