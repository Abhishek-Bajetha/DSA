---

## Question: Find the Factorial of a Number Using Recursion

### Problem Statement

Write a recursive function to find the **factorial** of a given number `N`.

---

### Description

The factorial of a number `N` is defined as the product of all positive integers less than or equal to `N`.

Mathematically:
```
factorial(N) = N × (N - 1) × (N - 2) × ... × 1
```

You need to solve this problem using **recursion**, without using loops or built-in factorial functions.

---

### Example

**Input:**
```
N = 5
```

**Output:**
```
120
```

**Explanation:**
```
5 × 4 × 3 × 2 × 1 = 120
```

---

### Constraints

- `0 <= N <= 12`  
(Factorials grow fast, so we limit N to avoid integer overflow.)

### Expected Time Complexity

- `O(N)`

### Expected Space Complexity

- `O(N)` (recursive stack)

---