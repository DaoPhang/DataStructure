package DS.Lab2.GeometricObject;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject g1 = new GeometricObject();
        System.out.println("=== Geometric Object ===");
        System.out.println(g1);

        Circle c1 = new Circle();
        System.out.println("\n=== Default Circle ===");
        System.out.println(c1);

        Circle c2 = new Circle(9.0, "black", false);
        System.out.println("\n=== Black, unfilled circle ===");
        System.out.println(c2);

        Rectangle r1 = new Rectangle();
        System.out.println("\n=== Default Rectangle ===");
        System.out.println(r1);
    }
}
