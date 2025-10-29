package DS.Week3;


public class App6 {
    //Numerical casting
    public static void main(String[] args) {
        byte bvalue = 20;
        short svalue = 55;
        int ivalue = 100;
        long lvalue = 1000;
        float fvalue = 30832092.984372f;
        double dvalue = 834213938.930219;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        ivalue = (int)lvalue;

        //example of upcasting
        Machine2 m2 = new Machine2();
        Camera c1 = new Camera();

        //upcasting
        Machine2 m3 = c1;
        //parent       //child
        
        //example downcasting
        Camera cam4 = (Camera)new Machine2();
        //child       //child
    }
}

class Machine2{
    public void start(){
        System.out.println("Machine startingggg");
    }
}

class Camera extends Machine2{
    @Override
    public void start(){
        System.out.println("Camera startingggg");
    }

    public void snap(){
        System.out.println("Camera snap photo");
    }

}