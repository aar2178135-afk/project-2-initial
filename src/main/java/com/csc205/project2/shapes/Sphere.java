package com.csc205.project2.shapes;
/**
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: ChatGPT (GPT-5.2)
 * Generation Date: February 23, 2026
 *
 * Original Prompt:
 * "Extends Shape3D (which implements ThreeDimensionalShape)
 *  Implement the abstract methods from ThreeDimensionalShape
 *  Include proper constructors with validation
 *  Override toString() with shape-specific formatting
 *  Add any shape-specific methods if needed
 *  for five of these shapes each
 *  Sphere - Properties: radius
 *  Cube - Properties: sideLength
 *  Cylinder - Properties: radius, height
 *  RectangularPrism - Properties: length, width, height
 *  Pyramid - Properties:..."
 *
 * Follow-up Prompts (if any):
 * 1. "Can you add the comment header to each of the classes?"
 *
 * Manual Modifications:
 * - None
 * - Code reviewed for clarity and assignment compliance
 *
 * Formula Verification:
 * - Volume formula verified against: Standard geometry formula V = (4/3)πr³
 * - Surface area formula verified against: Standard geometry formula A = 4πr²
 */
public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0.");
        }
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Shape-specific method
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return String.format(
                "Sphere [radius=%.2f, volume=%.2f, surfaceArea=%.2f]",
                radius, getVolume(), getSurfaceArea()
        );
    }
}