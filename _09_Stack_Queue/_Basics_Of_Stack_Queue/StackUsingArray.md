---

# Implement Stack using Array

## Problem Statement

Implement a **Stack** using a fixed-size array. Your stack should support the following operations:

* `push(x)`: Add an element `x` to the top of the stack. If the stack is full, print `"Stack is full..."`.
* `pop()`: Remove the element from the top of the stack. If the stack is empty, do nothing.
* `top()`: Print the element on the top of the stack. If the stack is empty, print `"Underflow"`.
* `size()`: Print the current size of the stack.

Use a static array of size 10 to store the elements.

## Examples

### Example 1:

**Input (Method Calls):**

```
size()
push(10)
push(20)
push(30)
size()
top()
pop()
top()
size()
```

**Output:**

```
Size is : 0
10 is pushed...
20 is pushed...
30 is pushed...
Size is : 3
30
30 is popped...
20
Size is : 2
```

---

### Example 2:

**Input (Method Calls):**

```
push(1)
push(2)
push(3)
push(4)
push(5)
push(6)
push(7)
push(8)
push(9)
push(10)
push(11)
```

**Output:**

```
1 is pushed...
2 is pushed...
3 is pushed...
4 is pushed...
5 is pushed...
6 is pushed...
7 is pushed...
8 is pushed...
9 is pushed...
10 is pushed...
Stack is full...
```

---
