package DS.Lab1;

public class Fan {
    
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed;
    private boolean STATUS;
    private double radius;
    String color;

    public Fan(){
        speed = SLOW;
        STATUS = false;
        radius = 5;
        color = "blue";
    }

    public static int getSlow() {
        return SLOW;
    }

    public static int getMedium() {
        return MEDIUM;
    }

    public static int getFast() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSTATUS() {
        return STATUS;
    }

    public void setSTATUS(boolean sTATUS) {
        STATUS = sTATUS;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        if(STATUS == true){
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else{
            return "Fan color: " + color + ", radius: " + radius + " (fan is off)";
        }
    }
}
