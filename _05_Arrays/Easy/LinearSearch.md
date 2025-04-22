---
# Linear Search in an Array

## Problem Statement

Given an array of integers and a target value `x`, perform a **linear search** to find the index of `x` in the array. If `x` is present, return its index (0-based). If not, return `-1`.

You should go through each element one by one from the beginning until the target is found.
---

## Examples

### Example 1:

**Input:**

```
arr = [4, 2, 7, 1, 9], x = 7
```

**Output:**

```
2
```

**Explanation:**
7 is present at index 2.

---

### Example 2:

**Input:**

```
arr = [5, 3, 6, 8], x = 1
```

**Output:**

```
-1
```

**Explanation:**
1 is not present in the array.

---

## Constraints

- `1 <= arr.length <= 10^5`
- `-10^9 <= arr[i], x <= 10^9`

---
