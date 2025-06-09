---

# Implement Stack using Linked List

## Problem Statement

Implement a **Stack** using a singly linked list. Your implementation should support the following operations:

* `push(x)`: Add an element `x` to the top of the stack.
* `pop()`: Remove and print the top element. If the stack is empty, print `"Stack is empty"`.
* `top()`: Print the top element of the stack.
* `size()`: Print the current number of elements in the stack.

The most recently added element should be removed first (**LIFO** order).

## Examples

### Example 1:

**Input (Method Calls):**

```
push(10)
top()
pop()
pop()
push(20)
size()
```

**Output:**

```
10 is pushed
10
10 is poped
Stack is empty
20 is pushed
1
```

---

### Example 2:

**Input (Method Calls):**

```
push(5)
push(15)
size()
pop()
top()
```

**Output:**

```
5 is pushed
15 is pushed
2
15 is poped
5
```

---
