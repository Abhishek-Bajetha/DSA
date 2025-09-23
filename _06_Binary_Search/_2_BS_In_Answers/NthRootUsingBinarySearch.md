## Problem Statement

Given two positive integers `x` and `n`, find the **nth root** of `x` using **binary search**.

Return the value of `r` such that:

```
r^n = x
```

If the nth root is not an integer, return `-1`.

You must not use built-in functions like `Math.pow()`.

---

## Examples

### Example 1:

**Input:**

```
x = 27, n = 3
```

**Output:**

```
3
```

**Explanation:**
The cube root of 27 is 3.

---

### Example 2:

**Input:**

```
x = 16, n = 4
```

**Output:**

```
2
```

**Explanation:**
The 4th root of 16 is 2.

---

### Example 3:

**Input:**

```
x = 15, n = 2
```

**Output:**

```
-1
```

**Explanation:**
There is no integer `r` such that `r^2 = 15`.

---

## Constraints

- `1 <= x <= 10^9`
- `1 <= n <= 30`

---

🔥 This is a **classic interview problem** often asked as a follow-up to **\[LeetCode 69: Sqrt(x)]**.

---
