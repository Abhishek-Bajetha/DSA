---
## Question: Find the Nth Fibonacci Number Using Recursion

### Problem Statement

Write a recursive function to calculate the `Nth` Fibonacci number.
---

### Description

The Fibonacci sequence is defined as:

```
F(0) = 0
F(1) = 1
F(n) = F(n - 1) + F(n - 2)  for n > 1
```

You are required to implement this logic using recursion to return the `Nth` term in the sequence.

---

### Example

**Input:**

```
N = 6
```

**Output:**

```
8
```

**Explanation:**
The Fibonacci sequence is:

```
0, 1, 1, 2, 3, 5, 8, ...
```

The 6th term (0-indexed) is `8`.

---

### Constraints

- `0 <= N <= 30`  
  (Since this is a recursive approach, large N may lead to time inefficiency.)

### Expected Time Complexity

- `O(2^N)`

### Expected Space Complexity

- `O(N)` (recursive stack)

---
