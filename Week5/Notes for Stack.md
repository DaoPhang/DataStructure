Here is the complete list of the main operations for a Stack. I have categorized them into Actions (modifying data) and Status Checks (checking the state of the stack).

1. Primary Actions (Modifying Data)
Push

What it does: Adds a new element to the top of the stack.

Note: If the stack has a fixed size limit and is already full, this operation causes a "Stack Overflow."

Pop

What it does: Removes the element currently at the top of the stack and returns it to you.

Note: If the stack is empty, this operation causes a "Stack Underflow" (or throws an error).

Peek (sometimes called Top)

What it does: Retrieves the value of the element at the top without removing it.

Note: Useful when you need to decide what to do next based on the current top item, but you aren't ready to discard it yet.

2. Status Checks (Helper Operations)
isEmpty

What it does: Returns true if the stack contains no elements, and false otherwise.

Importance: Crucial to use before performing a pop or peek to avoid crashing your program.

Size (or Count)

What it does: Returns the total number of elements currently stored in the stack.

Importance: Useful for loops or tracking memory usage.

isFull (Implementation dependent)

What it does: Returns true if the stack has reached its maximum capacity.

Importance: Only relevant if you are using a stack with a fixed limit (like an array of size 10). In modern dynamic lists (like Java's ArrayDeque), this is rarely used because the stack grows automatically.

3. Advanced / Specific (Java Context)
Search (Specific to java.util.Stack)

What it does: Returns the position of an element in the stack (how far down it is from the top).

Importance: Not part of the strict "Stack" definition, but useful if you need to know "Is element 'A' inside this stack, and how deep is it?"

Summary for your notes: The "Big Three" are Push, Pop, Peek. The "Safety Checks" are isEmpty, Size.



Here is a detailed breakdown of the Time Complexity (speed) and Space Complexity (memory) of Stack operations.In computer science, we use Big O Notation to measure how "expensive" an operation is.
$O(1)$ means Constant Time (Instant/Super fast). It takes the same amount of time regardless of whether the stack has 5 items or 5 million items.
$O(n)$ means Linear Time (Slower). The time it takes grows as the number of items ($n$) grows.

1. The "Fast" Operations: O(1)
The primary reason we use a Stack is that its core operations are incredibly fast.

Push: O(1)
Explanation: When you add an item to the stack, you simply place it on the "top."

Why it is efficient: You do not need to rearrange, shift, or touch any of the other items sitting below. If you have a stack of 1,000 plates, adding the 1,001st plate takes the exact same effort as adding the 1st plate.

Note on Implementation:

Linked List Stack: It is purely changing one pointer.

Dynamic Array Stack (like ArrayDeque): It is usually O(1). Occasionally, if the internal array is full, the computer must copy the data to a larger array (Amortized O(1)), but for almost all intents and purposes, treat it as O(1).

Pop: O(1)
Explanation: removing the top item.

Why it is efficient: You just grab the top item and move the "top" pointer down one step. The items below do not move.

Contrast with Arrays: If you removed the first element of a standard Array, you would have to shift every other element to the left to fill the gap (which is O(n)). Stacks avoid this entirely by only working at one end.

Peek: O(1)
Explanation: You are just reading the value at the "top" address. No memory is moved or changed.

isEmpty / Size: O(1)
Explanation: The stack keeps a simple counter variable (e.g., count = 5) that updates whenever you push or pop. Checking this variable is instant. It does not need to count the items one by one every time you ask.

2. The "Slow" Operation: O(n)
Stacks are specialized for "top-only" access. They perform poorly when you try to do things they weren't designed for.

Search (Accessing an arbitrary item): O(n)
Explanation: If you want to find a specific item (e.g., "Where is 'Plate 5'?"), or if you want to check if the stack contains "Plate 5," the computer must scan the stack starting from the top and going down to the bottom.

Why it is slow: In the worst case (if the item is at the very bottom), you have to look at every single item (n items).

Takeaway: If you need to search frequently, do not use a Stack. Use a HashMap or an Array instead.

3. Space Complexity
Space: O(n)
Explanation: A stack requires memory proportional to the number of items stored. If you store n items, you need n units of memory.

Overhead:

If implemented with a Linked List, there is slightly more memory overhead because every item needs to store the data plus a pointer (address) to the next item.

If implemented with an Array, the memory is allocated in blocks (e.g., it might reserve space for 10 items even if you only have 3 pushed so far).


Operation,Time Complexity,Description
Push,O(1),Excellent. No shifting required.
Pop,O(1),Excellent. No shifting required.
Peek,O(1),Excellent. Instant access to top.
Search,O(n),Poor. Must scan through the pile.
Space,O(n),Linear growth based on data size.