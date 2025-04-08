---

## Question: Print Numbers from N to 1 Without Backtracking

### Problem Statement

Write a recursive function to print numbers from `N` to `1` **without using backtracking**.

---

### Description

In this approach, you directly print the number before making the recursive call. This means each number is printed **before** diving deeper into the recursion, resulting in a top-down output from `N` to `1`.

---

### Example

**Input:**
```
N = 5
```

**Output:**
```
5
4
3
2
1
```

### Explanation:

The number is printed immediately in each recursive call before moving to the next smaller value, so the output is straightforward from `N` down to `1`.

---

### Constraints

- `1 <= N <= 1000`

### Expected Time Complexity

- `O(N)`

### Expected Space Complexity

- `O(N)` (recursive stack)

---
