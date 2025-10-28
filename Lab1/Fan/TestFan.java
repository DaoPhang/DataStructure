package DS.Lab1.Fan;

public class TestFan{
    public static void main (String[] args){

        // Create first Fan object
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setSTATUS(true);

        // Create second Fan object
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setSTATUS(false);

        // Display both Fan objects
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
