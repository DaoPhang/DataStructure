1. Core Concept
Definition: A linear data structure that follows the LIFO principle (Last-In, First-Out).

Analogy: A physical stack of plates. You can only add to the top and take from the top.

Visual: Top -> [ C, B, A ] -> Bottom

Operation,Time,Description
Push,O(1),Add item to the top. Fast.
Pop,O(1),Remove item from the top. Fast.
Peek,O(1),View the top item. Fast.
isEmpty,O(1),Check if empty. Fast.
Search,O(n),Find an item deep in the stack. Slow.
Space Complexity: $O(n)$ (Linear space relative to number of items).


3. Modern Java Implementation
Do not use java.util.Stack (Legacy/Slow). Use ArrayDeque.
import java.util.ArrayDeque;
import java.util.Deque;

// Initialize
Deque<String> stack = new ArrayDeque<>();

// 1. PUSH (Add)
stack.push("Data"); 

// 2. PEEK (Look)
// Always check if empty first!
if (!stack.isEmpty()) {
    String top = stack.peek();
}

// 3. POP (Remove)
if (!stack.isEmpty()) {
    String removed = stack.pop();
}


4. Operations Vocabulary
Push: Add to top.

Pop: Remove and return top.

Peek: Return top without removing.

isEmpty: Boolean check (Essential to prevent errors).

Size: Returns count of elements.

5. Critical Warnings ⚠️
Stack Underflow: Occurs if you call .pop() or .peek() on an empty stack. Always check .isEmpty() first.

Stack Overflow: Occurs if you push too many items onto a stack with a fixed limit (common in recursion).

No Random Access: You cannot index a stack (e.g., stack[2] is not allowed). You must pop items off to reach the bottom.

6. Common Use Cases
Undo mechanisms (Editors, Photoshop).

Browser History (Back button).

Syntax Parsing (Checking balanced parentheses (())).

Function Calls (The computer uses a "Call Stack" to manage running functions).

String Reversal.