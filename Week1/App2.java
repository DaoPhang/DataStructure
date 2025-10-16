/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app2;

/**
 *
 * @author pensyarah
 */



public class App2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Machine machine1 = new Machine(10, 20, 30, 40);           // constructor 1
        Machine machine2 = new Machine("Bobby");    // constructor 2
        Machine machine3 = new Machine("Champ", 112);   //constructor 3
        machine3.name = "xxx";
        System.out.println(machine3.name);
    }
    
}

class Machine{
    String name;
    int serialNum;
    
    // creating constructor for class Machine
    
    
    public Machine(String name){
        this("ahmad", 2004);
        //  this(10,20,30,40);      // this () must take first line
        System.out.println("Constructor 2 running...");
    }
    
    public Machine(String name, int serialNum){
        //this(1,2,3,4);
        System.out.println(name);
        System.out.println("Constructor 3 running...");
        System.out.println(serialNum);
    }
    
    public Machine (int a, int b, int c, int d){
        //this("some weird name");        // calling constructor 2
        System.out.println("Constructor 1 running...");
    }
}
