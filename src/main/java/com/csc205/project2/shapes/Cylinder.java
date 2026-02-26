package com.csc205.project2.shapes;
/**
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: ChatGPT (GPT-5.2)
 * Generation Date: February 23, 2026
 *
 * Original Prompt:
 * [Same as above]
 *
 * Follow-up Prompts (if any):
 * 1. "Can you add the comment header to each of the classes?"
 *
 * Manual Modifications:
 * - None
 *
 * Formula Verification:
 * - Volume formula verified against: V = πr²h
 * - Surface area formula verified against: A = 2πr(r + h)
 */
public class Cylinder extends Shape3D {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0.");
        }
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Shape-specific method
    public double getBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format(
                "Cylinder [radius=%.2f, height=%.2f, volume=%.2f, surfaceArea=%.2f]",
                radius, height, getVolume(), getSurfaceArea()
        );
    }
}
