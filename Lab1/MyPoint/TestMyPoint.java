package DS.Lab1.MyPoint;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.printf("Distance between points: %.3f%n" , p1.distance(p2));
        System.out.printf("Distance (static method): %.3f%n", MyPoint.distance(p1, p2));
    }
}
