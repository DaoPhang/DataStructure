package DS.Lab5;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> stack;

    public static void main(String[] args) {
        MyStack s = new MyStack();

        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack: " + s);

        s.pushMany("40, 50, 60");
        
        System.out.println("After pushMany: " + s);
        System.out.println("Peek (top): " + s.peek());
        System.out.println("Pop: " + s.pop());
        System.out.println("Stack after pop: " + s);

        System.out.println("PopAll: " + s.popAll());
        System.out.println("Stack now: " + s);
    }

    public MyStack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public Integer peek(){
        if(isEmpty()){
            return null;
        }
        return stack.get(stack.size() -1);
    }

    public void push(Integer value){
        stack.add(value);
    }

    public void pushMany(String values){
        String[] parts = values.split(",");

        for(String part: parts){
            stack.add(Integer.parseInt(part.trim()));
        }
    }

    public Integer pop(){
        if(isEmpty()){
            return null;
        }

        return stack.remove(stack.size() -1 );
    }

    public String popAll(){
        if(isEmpty()){
            return "Stack is empty";
        }

        StringBuilder sb = new StringBuilder();
        while(!isEmpty()){
            sb.append(pop()).append(" ");
        }
        return sb.toString().trim();
    }

    public String toString(){
        return stack.toString();
    }
}
