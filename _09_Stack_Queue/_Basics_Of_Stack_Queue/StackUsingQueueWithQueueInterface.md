# Implement Stack using Single Queue (Queue Interface)

## Problem Statement

Implement a **Stack** using Java's built-in `Queue` interface (using only **one** queue). Your stack should support the following operations:

* `push(x)`: Insert element `x` into the stack.
* `pop()`: Remove the top element of the stack. If the stack is empty, print `"Stack is empty"`.
* `top()`: Return and print the top element of the stack.

Maintain **LIFO** behavior (Last In, First Out) using a single queue internally.

## Approach

Each `push(x)` operation inserts the element at the end of the queue and then rotates the queue so that the newly added element comes to the front.

## Examples

### Example 1:

**Input (Method Calls):**

```
pop()
push(10)
push(20)
push(30)
push(40)
top()
pop()
pop()
top()
```

**Output:**

```
Stack is empty
10 is added
20 is added
30 is added
40 is added
Top is : 40
40 is removed
30 is removed
Top is : 20
```

---

### Example 2:

**Input (Method Calls):**

```
push(5)
top()
pop()
pop()
```

**Output:**

```
5 is added  
Top is : 5  
5 is removed  
Stack is empty  
```

---
