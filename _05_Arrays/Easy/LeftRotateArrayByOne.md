---
# Left Rotate the Array by One

## Problem Statement

Given an array of integers, your task is to **rotate** the array to the **left by one position**. This means each element will shift one place to the left, and the first element will move to the end of the array.

You should perform this operation **in-place**, modifying the original array without using any extra arrays.
---

## Examples

### Example 1:

**Input:**

```
arr = [1, 2, 3, 4, 5]
```

**Output:**

```
[2, 3, 4, 5, 1]
```

**Explanation:**
The element `1` moves to the end, and all others shift one position to the left.

---

### Example 2:

**Input:**

```
arr = [10, 20, 30]
```

**Output:**

```
[20, 30, 10]
```

---

## Constraints

- `1 <= arr.length <= 10^5`
- `-10^4 <= arr[i] <= 10^4`

---
