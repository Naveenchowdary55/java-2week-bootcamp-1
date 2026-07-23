// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * A helper for working with arrays of shapes.
 */
public class ShapeUtils {
    private ShapeUtils() {
        // nothing to do
    }

    /**
     * Adds up the areas of every shape in the array.
     *
     * <p>Loop over {@code shapes}, call {@code area()} on each (Java picks the
     * right subclass version automatically), and return the running total.
     *
     * @param shapes the shapes to measure
     * @return the sum of all their areas
     */
    public static double totalArea(Shape[] shapes) {
        double total = 0.0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;

        
    }
}
