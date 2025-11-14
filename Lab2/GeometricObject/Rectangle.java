package DS.Lab2.GeometricObject;

public class Rectangle extends GeometricObject {
    private double width, height;

    public Rectangle() {
        this.width = 1;
        this.height= 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle( double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*@Override
    public String toString(){
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height;
    }*/
}
