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
 * - Volume formula verified against: V = lwh
 * - Surface area formula verified against: A = 2(lw + lh + wh)
 */
public class RectangularPrism extends Shape3D {

    private double length;
    private double width;
    private double height;

    public RectangularPrism(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0.");
        }
        this.width = width;
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
        return length * width * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    // Shape-specific method
    public boolean isCube() {
        return length == width && width == height;
    }

    @Override
    public String toString() {
        return String.format(
                "RectangularPrism [length=%.2f, width=%.2f, height=%.2f, volume=%.2f, surfaceArea=%.2f]",
                length, width, height, getVolume(), getSurfaceArea()
        );
    }
}