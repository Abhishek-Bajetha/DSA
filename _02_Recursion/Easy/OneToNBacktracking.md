---

## Question 2B: Print 1 to N Using Backtracking

### What is Backtracking?

Backtracking is a problem-solving technique that involves exploring all possible solutions by building a solution incrementally and removing those solutions that fail to satisfy the problem's constraints (i.e., backtracking to try another path). In recursion, **backtracking typically means performing an operation *after* the recursive call**, during the "backtrack" phase.

---

### Problem Statement

Write a recursive function to print numbers from `1` to `N` using **backtracking**.

### Description

Make the recursive call first, and print the number during the backtrack phase. This approach is the reverse of the standard top-down recursion — you go deeper first and print values on the way back up.

### Example

**Input:**
```
N = 5
```

**Output:**
```
1
2
3
4
5
```

### Explanation:
Although the recursive calls go from N down to 1, the printing happens while returning from the recursive calls, resulting in numbers being printed in increasing order.

### Constraints
- `1 <= N <= 1000`

### Expected Time Complexity
- `O(N)`

### Expected Space Complexity
- `O(N)` (due to recursive stack)

---