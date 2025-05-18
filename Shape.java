/*
1. Create an abstract class "Shape" with the following specifications:
A. an abstract method "area()" of return type double
B. an abstract method "perimeter()" of return type double.
C. Put your code in a Java source file named "Shape.java."

2. Create a class "Rectangle" that extends the Shape class with the following specifications:
A. Attributes: width, length
B. Constructor: Implement a parameterized constructor needed initialize the data.
C. toString: Implement a "toString" method that prints out the area and perimeter 
D. Implement methods to compute the area and perimeter.

3. Create a class "Circle" that extends the Shape class with the following specifications:
A. Attributes: radius
B. Constructor: Implement a parameterized constructor to initialize the data.
C. toString: Implement a "toString" method that prints out the area and perimeter
D. Implement methods to compute the area and perimeter.

4. Create a class "Triangle" that extends the Shape class with the following specifications:
A. Attributes: length of side1, length of side2, length of side3, each is a double
B. Constructor: Implement a parameterized constructor to initialize the data.
C. toString: Implement a "toString" method that prints out the area and perimeter
D. Implement methods to compute the area and perimeter.

5. Create a driver class named "ShapeArray" with the following specifications:
A. Instantiate one triangle, one circle, & one square.
B. Store the class instances into an array named "shapeArray."
C. Loop through the array and print out the instance data of each object using the object instance's "toString" method.
*/

//1.A,B,C
public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}
// abstract class that acts as a blueprint for shapes including doubles for area
// and perimeter. This will help with subclasses

// 2.A
class Rectangle extends Shape {
    double width;
    double length;

    // class rectangle subclass of shape with doubles witdth and length

    // 2.B
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    // constructor takes in width and length and initializes them
    }
    // 2.D
    public double area() {
        return width * length;
    }
    // method for area (Dont Create seperate method for Rectangle area nad perimeter, USE DOUV+BLES FROM SUPERCLASS!!)

    public double perimeter() {
        return width + width + length + length;
    }
    // method for perimeter

    // 2.C
    public String toString() {
        return "Area: " + area() + " Perimeter: " + perimeter();
    }
    // tostring represents an object as a string. prints area and perimeter
}

// 3.A
class Circle extends Shape {
    double radius;
    // class Circle subclass of shape with double radius

    // 3.B
    Circle(double radius) {
        this.radius = radius;
        }
    // constructor takes in radius and initializes them

    // 3.D
    public double area() {
        return Math.PI * radius * radius;
    }
    // method for area

    public double perimeter() {
        return Math.PI * radius * 2;
    }
    // method for perimeter

    // 3.C
    public String toString() {
        return "Area: " + area() + " Perimeter: " + perimeter();
    }
    // tostring represents an object as a string. prints area and perimeter
}

// 4.A
class Triangle extends Shape {
    double side1;
    double side2;
    double side3;
    // class Triangle subclass of shape with doubles side1, side2, and side3

    // 4.B
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // constructor takes in side1, side2, and side3 and initializes them

    // 4.D
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    // method for area

    public double perimeter() {
        return side1 + side2 + side3;
    }
    // method for perimeter

    // 4.C
    public String toString() {
        return "Area: " + area() + " Perimeter: " + perimeter();
    }
    // tostring represents an object as a string. prints area and perimeter
}

// 5.A,B,C
class ShapeArray{

    public static void main(String[] args) {
         Shape[] shapeArray = new Shape[3];
        shapeArray[0] = new Triangle(1,2,3);
        shapeArray[1] = new Circle(3);
        shapeArray[2] = new Rectangle(4,4);

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
}

    // class shaperray is a driver class because it contains the main method
    //shapearray is a class that holds 3 shape objects
    //objects are set array indexes 0,1, and 2 and are set to new to instantiate them 
    //values are entered for shapes
    //for each loop goes through each shape in the shapearray and prints tostring method for each shape

}

/*
 * Recources:
 * https://www.scholarhat.com/tutorial/java/parameterized-constructor-in-java#:~
 * :text=What%20is%20a%20Parameterized%20Constructor,at%20the%20time%20of%
 * 20creation.
 * https://www.geeksforgeeks.org/abstract-methods-in-java-with-examples/
 * https://www.w3schools.com/java/java_constructors.asp
 * https://www.geeksforgeeks.org/object-tostring-method-in-java/
 * https://www.cuemath.com/measurement/area-of-triangle-with-3-sides/
 * https://www.geeksforgeeks.org/java-sqrt-method-examples/
 * https://stackoverflow.com/questions/765751/what-is-a-driver-class
 * https://www.naukri.com/code360/library/instantiation-in-java
 * https://www.reddit.com/r/learnprogramming/comments/f31b4s/
 * help_me_to_understand_what_instantiating_means/
 * https://www.w3schools.com/java/java_arrays.asp
 * https://www.geeksforgeeks.org/for-each-loop-in-java/
 * https://www.geeksforgeeks.org/how-to-create-array-of-objects-in-java/
 */