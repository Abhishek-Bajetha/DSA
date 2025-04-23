---
# Find the Missing Number in an Unsorted Array

## Problem Statement

You are given an **unsorted array** of size `n - 1` containing **distinct integers** in the range from `1` to `n`. One number from the range is **missing**. Your task is to find and return the missing number.

The array is not sorted, so your logic should work regardless of the order of elements.
---

## Examples

### Example 1:

**Input:**

```
n = 6
arr = [6, 1, 2, 4, 5]
```

**Output:**

```
3
```

**Explanation:**
From the range `1` to `6`, the number `3` is missing.

---

### Example 2:

**Input:**

```
n = 4
arr = [3, 1, 4]
```

**Output:**

```
2
```

**Explanation:**
From the range `1` to `4`, the number `2` is missing.

---

## Constraints

- `2 <= n <= 10^6`
- `1 <= arr[i] <= n`
- All array elements are **distinct**
- The array is **not sorted**

---
