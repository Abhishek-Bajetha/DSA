# Implement Queue using Two Stacks

## Problem Statement

Implement a **Queue** (First In, First Out) using **two stacks**. Your implementation should support the following operations:

- `enqueue(x)`: Add element `x` to the end of the queue.
- `dequeue()`: Remove and print the front element of the queue. If the queue is empty, print `"Queue is empty"`.
- `peek()`: Return and print the front element without removing it. If the queue is empty, print `"Queue is empty"` and return `-1`.

Use only stack operations: `push`, `pop`, `peek`, and `isEmpty`.

## Rules

- Use **two stacks** (`s1` and `s2`) to simulate queue behavior.
- You are not allowed to use any list, array, or queue internally for logic.
- You may choose to make either `enqueue()` or `dequeue()` costly based on your design.

## Examples

### Example 1:

**Input (Method Calls):**

```
enqueue(10)
enqueue(20)
enqueue(30)
peek()
dequeue()
peek()
dequeue()
dequeue()
dequeue()
```

**Output:**

```
10 is enqueued
20 is enqueued
30 is enqueued
Front is : 10
10 is dequeued
Front is : 20
20 is dequeued
30 is dequeued
Queue is empty
```

---

### Example 2:

**Input (Method Calls):**

```
peek()
enqueue(5)
peek()
dequeue()
peek()
```

**Output:**

```
Queue is empty
5 is enqueued
Front is : 5
5 is dequeued
Queue is empty
```

---
