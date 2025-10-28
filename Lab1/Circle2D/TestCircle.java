package DS.Lab1.Circle2D;

public class TestCircle {
    public static void main(String[] args) {
        // Create circle c1
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        // Display area and perimeter
        System.out.println("Circle c1:");
        System.out.printf("Area = %.2f%n", c1.getArea());
        System.out.printf("Perimeter = %.2f%n", c1.getPerimeter());

        // Test contains(x, y)
        System.out.println("\nContains point (3, 3)? " + c1.contains(3, 3));

        // Test contains(circle)
        System.out.println("Contains circle (4, 5, 10.5)? " + c1.contains(new Circle2D(4, 5, 10.5)));

        // Test overlaps(circle)
        System.out.println("Overlaps circle (3, 5, 2.3)? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
