# Reflections Log

This document serves as a log of reflections on various topics, capturing insights, lessons learned, and personal growth. It is intended to help users track their thoughts and experiences over time. 

/*
If we were to calculate the volume and surface area of all shapes created in the ShapeDriver class, we would need to implement the formulas for each shape. 
For example, the formulas for the shapes mentioned in the ShapeDriver class are as follows:
Sphere: Volume = (4/3)πr³, Surface Area = 4πr²
Cube: Volume = s³, Surface Area = 6s²
Cylinder: Volume = πr²h, Surface Area = 2πr(r + h)
Rectangular Prism: Volume = lwh, Surface Area = 2(lw + lh + wh)
Pyramid: Volume = (1/3)Bh, Surface Area = B + (1/2)Pl
Where r is the radius, s is the side length, h is the height, l is the length, w is the width, B is the area of the base, and P is the perimeter of the base.

In order to verify that the ShapeDriver is working correctly, we can perform a test by creating a shape with known dimensions and calculating its volume and surface area. For instance, if we create a cube with sides of length 3 units, we can calculate the expected volume and surface area as follows:
- Volume: 3 * 3 * 3 = 27 cubic units
- Surface Area: (3 * 3) * 6 = 54 square units

As a result, we can compare the calculated values with the expected values to confirm that the ShapeDriver is functioning correctly. If the calculated volume and surface area match the expected values, we can conclude that the ShapeDriver is working as intended.
"Choose shape to create:
1. Sphere
2. Cube
3. Cylinder
4. Rectangular Prism
5. Pyramid
0. Finish
   Enter choice: 1
   Enter name: Sphere
   Enter radius: 3
   Choose shape to create:
1. Sphere
2. Cube
3. Cylinder
4. Rectangular Prism
5. Pyramid
0. Finish
   Enter choice: 2
   Enter name: Cube
   Enter side length: 3
   Choose shape to create:
1. Sphere
2. Cube
3. Cylinder
4. Rectangular Prism
5. Pyramid
0. Finish
   Enter choice: 3
   Enter name: Cylinder
   Enter radius: 3
   Enter height: 3
   Choose shape to create:
1. Sphere
2. Cube
3. Cylinder
4. Rectangular Prism
5. Pyramid
0. Finish
   Enter choice: 4
   Enter name: Rectangular Prism
   Enter length: 3
   Enter width: 5
   Enter height: 4
   Choose shape to create:
1. Sphere
2. Cube
3. Cylinder
4. Rectangular Prism
5. Pyramid
0. Finish
   Enter choice: 5
   Enter name: Pyramid
   Enter base length: 3
   Enter height: 3
   Choose shape to create:
1. Sphere
2. Cube
3. Cylinder
4. Rectangular Prism
5. Pyramid
0. Finish
   Enter choice: 0

Created Shapes:

1. Sphere {name='Sphere'}
   - Surface Area: 113.10 square units
   - Volume: 113.10 cubic units
   - Calculation Time: 7620500 ns

2. Cube {name='Cube'}
   - Surface Area: 54.00 square units
   - Volume: 27.00 cubic units
   - Calculation Time: 7400 ns

3. Cylinder {name='Cylinder'}
   - Surface Area: 113.10 square units
   - Volume: 84.82 cubic units
   - Calculation Time: 2300 ns

4. RectangularPrism {name='Rectangular Prism'}
   - Surface Area: 94.00 square units
   - Volume: 60.00 cubic units
   - Calculation Time: 1300 ns

5. Pyramid {name='Pyramid'}
   - Surface Area: 29.12 square units
   - Volume: 9.00 cubic units
   - Calculation Time: 2800 ns

Analysis Results:
- Largest Volume: Sphere (113.10)
- Largest Surface Area: Sphere (113.10)
- Most Efficient (Volume/Surface): Sphere (1.00)

Process finished with exit code 0
"

After running the ShapeDriver class to perform the calculation for the cube, I was able to confirm that the calculated volume and surface area matched the expected values. This indicates that the ShapeDriver is functioning correctly for the cube shape. The calculated volume of 27 cubic units and surface area of 54 square units align with the theoretical calculations based on the dimensions provided. This successful test gives me confidence in the accuracy of the ShapeDriver for calculating properties of geometric shapes.
I've also done a test of the other shapes, and the results were consistent with the expected values for each shape. This further reinforces the reliability of the ShapeDriver in performing accurate calculations for various geometric shapes. Overall, this exercise has provided valuable insights into the functionality of the ShapeDriver and has helped me understand how to use it effectively for calculating properties of different shapes.

*/



