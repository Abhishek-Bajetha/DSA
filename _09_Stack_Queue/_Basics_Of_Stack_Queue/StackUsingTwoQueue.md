# Implement Stack using Two Queues

## Problem Statement

Implement a **Stack** (Last In, First Out) using **two queues**. Your implementation should support the following operations:

* `push(x)`: Insert element `x` into the stack.
* `pop()`: Remove and print the top element. If the stack is empty, print `"Stack is empty"`.
* `top()`: Return and print the top element of the stack. If the stack is empty, print `"Stack is empty"` and return `-1`.

You are allowed to use only the standard queue operations: `enqueue`, `dequeue`, `peek`, `isEmpty`, and `size`.

## Rules

* Use **two queues** (`q1` and `q2`) to simulate stack behavior.
* You may choose to make either `push()` or `pop()` costly depending on your logic.
* Do not use any built-in stack or list structure to simulate the stack.

## Examples

### Example 1:

**Input (Method Calls):**

```
push(10)
push(20)
push(30)
top()
pop()
top()
pop()
pop()
pop()
```

**Output:**

```
10 is pushed
20 is pushed
30 is pushed
Top is : 30
30 is popped
Top is : 20
20 is popped
10 is popped
Stack is empty
```

---

### Example 2:

**Input (Method Calls):**

```
top()
push(5)
top()
pop()
pop()
```

**Output:**

```
Stack is empty
5 is pushed
Top is : 5
5 is popped
Stack is empty
```

---

