package DS.Lab9;

public class Tester {
    
    public static void main(String[] args) {
        // Declare three MyLinkedList to store Integers
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        MyLinkedList<Integer> list3;
        
        list1.addLast(2);
        list1.addLast(10);
        list1.addLast(38);
        list1.addLast(41);
        list1.addLast(51);
        
        
        list2.addLast(5);
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(35);
        list2.addLast(41);
        list2.addLast(56);
        
        
        list3 = list1.combine(list1, list2);
        
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(list3.toString());
    }
}
