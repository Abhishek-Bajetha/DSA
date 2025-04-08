---
## Question: Print Numbers from N to 1 Using Backtracking

### What is Backtracking?

Backtracking is a recursive problem-solving technique where operations are performed after the recursive call, i.e., on the way back from recursion. In this problem, instead of printing the number before the recursive call, you delay printing until after the call, creating a backtrack effect.
---

### Problem Statement

Write a recursive function to print numbers from `N` to `1` **using backtracking**.

### Description

In this method, the recursive function will call itself to reach the base case, and then print the values during the backtracking (return) phase. This ensures the values are printed in reverse order.

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

Although the recursive calls count up (from 1 to N), the values are printed during the return phase, effectively printing them from `N` down to `1`.

---

### Constraints

- `1 <= N <= 1000`

### Expected Time Complexity

- `O(N)`

### Expected Space Complexity

- `O(N)` (recursive stack)

---
