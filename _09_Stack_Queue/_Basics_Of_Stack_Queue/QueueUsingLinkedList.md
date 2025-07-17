# Implement Queue using Linked List

## Problem Statement

Implement a **Queue** using a singly linked list. The queue should support the following operations:

* `push(x)`: Insert element `x` at the end of the queue.
* `pop()`: Remove the element from the front of the queue. If the queue is empty, print `"No elements"`.
* `top()`: Return the element at the front of the queue. If the queue is empty, print `"No elements"` and return `-1`.

This queue should work in **FIFO** (First-In-First-Out) order.

## Examples

### Example 1:

**Input (Method Calls):**

```
push(10)
push(20)
push(30)
push(40)
top()
pop()
top()
pop()
top()
pop()
top()
pop()
top()
```

**Output:**

```
10
20
30
40
No elements -1
```

---

### Example 2:

**Input (Method Calls):**

```
top()
push(5)
push(15)
top()
pop()
top()
```

**Output:**

```
No elements -1  
5  
15
```

---