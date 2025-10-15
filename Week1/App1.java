public class App1 {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Bruh";
        person1.height= 1.8;

        Person person2 = new Person();
        person2.name = "Sara";
        person2.height =2.0;

        System.out.println(person1.name + " height's is " + person1.height);
        person1.eat();
        System.out.print(person2.name + person2.sleeping());

        Student student1 = new Student();
        student1.eat();
        person1.eat();
    }
}

class Person{
        //1.data
        String name;
        protected double height;

        //2. methods
        String sleeping(){
            return "is sleeping";
        }

        void eat(){
            System.out.println(name + " loves malaysian food and he/she is " + height);
        }
    }

class Student{
    void eat(){
        System.out.println("Student on a diet...");
    }
}