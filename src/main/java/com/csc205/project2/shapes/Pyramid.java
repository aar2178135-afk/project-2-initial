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
 * - Assumed square base pyramid for clarity
 *
 * Formula Verification:
 * - Volume formula verified against: V = (1/3)Bh
 * - Surface area formula verified against: A = base area + lateral area using slant height
 */

public class Pyramid extends Shape3D {

    private double baseLength;
    private double height;

    public Pyramid(double baseLength, double height) {
        setBaseLength(baseLength);
        setHeight(height);
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        if (baseLength <= 0) {
            throw new IllegalArgumentException("Base length must be greater than 0.");
        }
        this.baseLength = baseLength;
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
        return (1.0 / 3.0) * Math.pow(baseLength, 2) * height;
    }

    @Override
    public double getSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2));
        double baseArea = Math.pow(baseLength, 2);
        double lateralArea = 2 * baseLength * slantHeight;
        return baseArea + lateralArea;
    }

    // Shape-specific method
    public double getSlantHeight() {
        return Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2));
    }

    @Override
    public String toString() {
        return String.format(
                "Pyramid [baseLength=%.2f, height=%.2f, volume=%.2f, surfaceArea=%.2f]",
                baseLength, height, getVolume(), getSurfaceArea()
        );
    }
}
