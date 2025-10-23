
public class App3 {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        Robot sam = new Robot();
        
        sam.speak();
        sam.speak("I hate human...");
        sam.calculate_min_jump(100, "Jump");
        int a = 99;
        sam.calculate_min_jump(a, "Jump");
        
        int A = sam.calculate_min_jump(156, "zati");
        System.out.println(a);
        
        Frog frog1 = new Frog();
        frog1.name = "Kermit";
        frog1.setName("Angela");
        frog1.setAge(123);
        frog1.getName();
        System.out.println(frog1.getName());
        
        System.out.println("Before creat Thing Objects, count is " + Thing.count);
        
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        Thing thing3 = new Thing();
        
        System.out.println("After Thing creation, count is " + Thing.count);
        
        thing1.name = "Bob";
        thing2.name = "Sue";
        thing3.desc = "description";
        System.out.println(thing1.name);
        System.out.println(thing2.name);
        System.out.println(thing3.desc); // can still call static data, but the actually the complier consider it as System.out.println(Thing.desc);
        thing1.showName();
        thing2.showName();
        thing3.showInfo(); // also can still call static method, but the best way to use the class name
        Thing.showInfo();
        /*
            Static members belong to the class (rather than to a specific object).
            Even though static members are accessed through an object, it is only "grammatically allowed", but logically they are still accessed through the class.
        */
        //Thing.setName() // the class name cannnot call the normal methods
        
        System.out.println(Math.PI);
        // Math.PI = 123.123; // we cannot change the PI, because it is a FINAL STATIC
        
        // Thing.LUCKY_NUM = 77;
        
        
    }
}
