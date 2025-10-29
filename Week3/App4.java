package DS.Week3;

//protected data/method can only be access inside the same package

public class App4 {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.start();
        m1.name = "Machine\n";
        System.out.print(m1.name);
        
        Car c1 = new Car();
        c1.showInfo();
        c1.wipeWindShield();
        c1.start();
        c1.stop();
        c1.name = "child name\n";
        System.out.println(c1.name);
        c1.showInfo();
    }
}

class Machine {
    protected String name = "Type 1...";

    public void start(){
        System.out.println("Machine start...");
    }
    

    public void stop(){
        System.out.println("Machine Stop...");
    }
}

class Car extends Machine{
    //Machine is parent, Car is child class
    //What extends means?
    //Car can inherit from Machine
    //Question is car identical to Machine?
    //No
    //inheritance allow you to perform method overridng

    public void wipeWindShield(){
        System.out.println("Wiping Windshield...");
    }

    @Override
    public void start(){
        System.out.println("Car Starts");
        super.start();
    }

    @Override
    public void stop(){
        System.out.println("Car stops");
        super.stop();
    }

    public void showInfo(){
        System.out.println("Info: " + name);
    }
}