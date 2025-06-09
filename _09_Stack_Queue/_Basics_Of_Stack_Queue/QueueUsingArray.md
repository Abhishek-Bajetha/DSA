---

# Implement Circular Queue using Array

## Problem Statement

Implement a **circular queue** using a fixed-size array. The queue should support the following operations:

* `enqueue(x)`: Insert an element `x` at the rear of the queue. If the queue is full, print `"Queue is full"`.
* `dequeue()`: Remove the element from the front of the queue. If the queue is empty, print `"Queue is empty"`.
* `top()`: Print the element at the front of the queue. If the queue is empty, print `"Queue is empty"`.

You should use modular arithmetic to wrap around when reaching the end of the array.

## Examples

### Example 1:

**Input (Method Calls):**

```
enqueue(10)
enqueue(20)
enqueue(30)
dequeue()
top()
dequeue()
dequeue()
enqueue(40)
```

**Output:**

```
10 is added
20 is added
Queue is full
10 is removed
Top is: 20
20 is removed
Queue is empty
40 is added
```

---

### Example 2:

**Input (Method Calls):**

```
enqueue(1)
dequeue()
top()
```

**Output:**

```
1 is added
1 is removed
Queue is empty
```

---
