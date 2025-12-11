package DS.Week8;

/**
 * COMPARISON: Generic vs Non-Generic Linked List
 * 
 * The current LinkedList.java is a GENERIC linked list.
 * Below are examples showing the difference.
 */

// ============================================
// GENERIC LINKED LIST (What you currently have)
// ============================================
// Can work with ANY data type
class GenericLinkedList<T> {
    class Node {
        T data;        // Generic type - can be Integer, String, etc.
        Node next;
    }
    // Usage:
    // GenericLinkedList<Integer> intList = new GenericLinkedList<>();
    // GenericLinkedList<String> strList = new GenericLinkedList<>();
}

// ============================================
// NON-GENERIC LINKED LIST (Integer only)
// ============================================
// Only works with ONE specific type (Integer in this case)
class IntegerLinkedList {
    class Node {
        int data;      // Fixed to int/Integer only
        Node next;
    }
    // Usage:
    // IntegerLinkedList list = new IntegerLinkedList();
    // Can ONLY store integers, nothing else!
}

// ============================================
// NON-GENERIC LINKED LIST (String only)
// ============================================
// Only works with ONE specific type (String in this case)
class StringLinkedList {
    class Node {
        String data;   // Fixed to String only
        Node next;
    }
    // Usage:
    // StringLinkedList list = new StringLinkedList();
    // Can ONLY store strings, nothing else!
}

/**
 * KEY POINTS:
 * 
 * 1. STRUCTURE: Both generic and non-generic linked lists have the SAME structure:
 *    - Nodes with data and next pointer
 *    - Head pointer
 *    - Same operations (add, remove, etc.)
 * 
 * 2. DIFFERENCE: The generic version uses <T> to work with ANY type,
 *    while non-generic is locked to ONE specific type.
 * 
 * 3. YOUR CURRENT LinkedList.java IS GENERIC because:
 *    - It has <T> in the class declaration
 *    - You can use it with: LinkedList<Integer>, LinkedList<String>, etc.
 * 
 * 4. STANDARD PRACTICE: Modern Java uses generic linked lists
 *    (like java.util.LinkedList<E> in the standard library)
 */

