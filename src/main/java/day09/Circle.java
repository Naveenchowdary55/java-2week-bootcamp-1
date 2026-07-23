// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * A circle. Its area is π × radius².
 *
 * <p>Example:
 * <pre>
 *   Shape s = new Circle(2.0);
 *   s.area();   // Math.PI * 4  ≈ 12.566...
 * </pre>
 */
public class Circle extends Shape {
    private double radius;


    /**
     * Creates a circle with the given radius.
     *
     * <p>Hint: store the radius in a field so {@link #area()} can use it.
     *
     * @param radius the circle's radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return the circle's radius
     */
    public double getRadius() {
        return radius;
    }
         @Override
        public double area() {
        return Math.PI * radius * radius;
    }
}

 