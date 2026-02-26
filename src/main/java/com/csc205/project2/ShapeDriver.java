package com.csc205.project2;
import com.csc205.project2.shapes.*;

import java.util.*;
import java.text.DecimalFormat;

public class ShapeDriver {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.00");

    // Wrapper class to associate a name with a Shape3D
    static class NamedShape {
        String name;
        Shape3D shape;

        NamedShape(String name, Shape3D shape) {
            this.name = name;
            this.shape = shape;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== 3D Shape Analysis System ===\n");

        List<NamedShape> shapes = new ArrayList<>();

        boolean running = true;

        while (running) {
            System.out.println("Choose shape to create:");
            System.out.println("1. Sphere");
            System.out.println("2. Cube");
            System.out.println("3. Cylinder");
            System.out.println("4. Rectangular Prism");
            System.out.println("5. Pyramid");
            System.out.println("0. Finish");

            int choice = getIntInput("Enter choice: ");

            switch (choice) {
                case 1 -> shapes.add(createSphere());
                case 2 -> shapes.add(createCube());
                case 3 -> shapes.add(createCylinder());
                case 4 -> shapes.add(createRectangularPrism());
                case 5 -> shapes.add(createPyramid());
                case 0 -> running = false;
                default -> System.out.println("Invalid choice.\n");
            }
        }

        if (shapes.isEmpty()) {
            System.out.println("No shapes created.");
            return;
        }

        printShapes(shapes);
        performAnalysis(shapes);
    }

    // ===============================
    // Shape Creation Methods
    // ===============================

    private static NamedShape createSphere() {
        String name = getStringInput("Enter name: ");
        double radius = getDoubleInput("Enter radius: ");
        return new NamedShape(name, new Sphere(radius));
    }

    private static NamedShape createCube() {
        String name = getStringInput("Enter name: ");
        double side = getDoubleInput("Enter side length: ");
        return new NamedShape(name, new Cube(side));
    }

    private static NamedShape createCylinder() {
        String name = getStringInput("Enter name: ");
        double radius = getDoubleInput("Enter radius: ");
        double height = getDoubleInput("Enter height: ");
        return new NamedShape(name, new Cylinder(radius, height));
    }

    private static NamedShape createRectangularPrism() {
        String name = getStringInput("Enter name: ");
        double length = getDoubleInput("Enter length: ");
        double width = getDoubleInput("Enter width: ");
        double height = getDoubleInput("Enter height: ");
        return new NamedShape(name, new RectangularPrism(length, width, height));
    }

    private static NamedShape createPyramid() {
        String name = getStringInput("Enter name: ");
        double base = getDoubleInput("Enter base length: ");
        double height = getDoubleInput("Enter height: ");
        return new NamedShape(name, new Pyramid(base, height));
    }

    // ===============================
    // Output & Analysis
    // ===============================

    private static void printShapes(List<NamedShape> shapes) {

        System.out.println("\nCreated Shapes:\n");

        int index = 1;

        for (NamedShape ns : shapes) {

            long startTime = System.nanoTime();
            double surface = ns.shape.getSurfaceArea();
            double volume = ns.shape.getVolume();
            long endTime = System.nanoTime();

            System.out.println(index++ + ". " +
                    ns.shape.getClass().getSimpleName() +
                    " {name='" + ns.name + "'}");

            System.out.println("   - Surface Area: " +
                    df.format(surface) + " square units");

            System.out.println("   - Volume: " +
                    df.format(volume) + " cubic units");

            System.out.println("   - Calculation Time: " +
                    (endTime - startTime) + " ns\n");
        }
    }

    private static void performAnalysis(List<NamedShape> shapes) {

        NamedShape largestVolume = shapes.get(0);
        NamedShape largestSurface = shapes.get(0);
        NamedShape mostEfficient = shapes.get(0);

        for (NamedShape ns : shapes) {

            if (ns.shape.getVolume() >
                    largestVolume.shape.getVolume()) {
                largestVolume = ns;
            }

            if (ns.shape.getSurfaceArea() >
                    largestSurface.shape.getSurfaceArea()) {
                largestSurface = ns;
            }

            double efficiency =
                    ns.shape.getVolume() /
                            ns.shape.getSurfaceArea();

            double bestEfficiency =
                    mostEfficient.shape.getVolume() /
                            mostEfficient.shape.getSurfaceArea();

            if (efficiency > bestEfficiency) {
                mostEfficient = ns;
            }
        }

        System.out.println("Analysis Results:");
        System.out.println("- Largest Volume: " +
                largestVolume.name + " (" +
                df.format(largestVolume.shape.getVolume()) + ")");

        System.out.println("- Largest Surface Area: " +
                largestSurface.name + " (" +
                df.format(largestSurface.shape.getSurfaceArea()) + ")");

        double efficiency =
                mostEfficient.shape.getVolume() /
                        mostEfficient.shape.getSurfaceArea();

        System.out.println("- Most Efficient (Volume/Surface): " +
                mostEfficient.name + " (" +
                df.format(efficiency) + ")");
    }

    // ===============================
    // Input Helpers
    // ===============================

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Try again.");
            }
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine());
                if (value <= 0) {
                    System.out.println("Value must be positive.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
