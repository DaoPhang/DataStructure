package DS.Week2;

public class Thing {
    // A LOOK INTO STATC AND FINAL
    
    public String name; // default access socifier public
    public static String desc; // static access soecifier
    /* Everyone in the main class can access the public & public static*/
    
    final static int LUCKY_NUM = 7;
    
    public static int count = 0;
    public int id;
    
    public Thing() {
        id = count;
        count++;
    }
    
    public void showName() {
        System.out.println(name);
        System.out.println("Obejct id: " + id + ", " + desc + ": " + name);
    }
    
    // this is static method
    // can only called by clss
    public static void showInfo() {
        System.out.println("sine secret info...");
        // System.out.println(name); // not allowed to call non-static data inside static methods
    }
}
