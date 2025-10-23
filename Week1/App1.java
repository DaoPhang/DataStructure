
package DS.Week1;

class Person{
    // class can have
    // 1. data/attributes
    String name;
    double height;
    // 2. methods
    void eat(int a, int b, int c){
        
        System.out.println(name + " loves malaysian food and he is " + height + " tall");
    }
}

class Student{

    void eat(){
        System.out.println("Student on diet...");
    }
}

public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Amroooo";
        person1.height = 1.85;
        
        Person person2 = new Person();
        person2.name = "Sarah";
        person2.height = 2.0;
        
        System.out.println(person1.name);
        Student student1 = new Student();
        student1.eat();
        person1.eat(10, 20, 30);
        
        
        
        
    }

}
