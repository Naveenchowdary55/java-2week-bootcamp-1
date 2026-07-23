// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * Base class for shapes. This class is PROVIDED — you do not change it. Your job
 * is to write the subclasses ({@link Circle}, {@link Rectangle},
 * {@link Triangle}) that override {@link #area()}.
 *
 * <p>Notice that the base {@code area()} returns {@code 0.0}. That's a bit of a
 * <b>design smell</b>: a plain "shape" has no meaningful area, yet here we're
 * forced to return a fake value. Tomorrow (Day 10) you'll fix this properly by
 * making {@code Shape} <b>abstract</b> so it can declare "every shape has an
 * area" without pretending to compute one.
 */
public class Shape {
    public Shape() {
        // nothing to do
    }

    /**
     * @return the area of this shape. The base version returns {@code 0.0};
     *         each subclass overrides it with the real formula.
     */
    public double area() {
        return 0.0;
        
    }
}
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle(2);
        Shape s2 = new Rectangle(4, 5);
        Shape s3 = new Triangle(6, 4);

        System.out.println("Circle Area    : " + s1.area());
        System.out.println("Rectangle Area : " + s2.area());
        System.out.println("Triangle Area  : " + s3.area());
    }
}
