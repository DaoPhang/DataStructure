
public class Frog {
    
    String name;
    int age;
    
    // problems sout
    
    /*System.out.println(name);
    In java file, the class body only include:
        1. methods
        2. fields
        3. constructors
        4. initializer blocks
        5. inner classes
    sout is statement, and the statement only can be included:
        1. inner methods
        2. inner constructor
        3. initializer blocks
    */
    
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
        System.out.println(age);
    }
    
    public int getAge() {
        return this.age;
    }
}
