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
 * - Volume formula verified against: V = s³
 * - Surface area formula verified against: A = 6s²
 */
public class Cube extends Shape3D {

    private double sideLength;

    public Cube(double sideLength) {
        setSideLength(sideLength);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 0.");
        }
        this.sideLength = sideLength;
    }

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    // Shape-specific method
    public double getFaceArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public String toString() {
        return String.format(
                "Cube [sideLength=%.2f, volume=%.2f, surfaceArea=%.2f]",
                sideLength, getVolume(), getSurfaceArea()
        );
    }
}
