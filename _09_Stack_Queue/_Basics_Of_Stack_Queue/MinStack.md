# Implement Stack with getMin() in O(1)

## Problem Statement

Design a **stack** that supports the following operations in **O(1)** time:

* `push(x)`: Push element `x` onto the stack.
* `pop()`: Remove the top element from the stack.
* `top()`: Return the top element.
* `getMin()`: Return the **minimum** element in the stack.

All operations must be **constant time**.

## Examples

### Example 1:

**Input (Method Calls):**

```
push(5)
push(2)
push(8)
getMin()
pop()
getMin()
top()
```

**Output:**

```
5 is pushed
2 is pushed
8 is pushed
Minimum is: 2
8 is popped
Minimum is: 2
Top is: 2
```

---

### Example 2:

**Input (Method Calls):**

```
push(3)
push(4)
push(1)
getMin()
pop()
getMin()
```

**Output:**

```
3 is pushed
4 is pushed
1 is pushed
Minimum is: 1
1 is popped
Minimum is: 3
```

---
