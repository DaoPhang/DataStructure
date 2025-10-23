package DS.Lab1;

public class MyPoint {

    private double x;
    private double y;
    
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //A method named distance that returns the distance from this point to a specified point of the MyPoint type.
    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }
    
    //Method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    //Static method named distance
    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}
