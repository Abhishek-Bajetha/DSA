---
### File Name Suggestion: `LeftRotateArrayByK.java`
---

# Left Rotate the Array by K Positions

## Problem Statement

Given an array of integers and a non-negative integer `k`, rotate the array to the **left by `k` positions**. This means that each element in the array will move `k` places to the left, and the elements that fall off the start will reappear at the end in the same order.

You should aim to perform the rotation **in-place**, modifying the original array without using additional arrays.

---

## Examples

### Example 1:

**Input:**

```
arr = [1, 2, 3, 4, 5]
k = 2
```

**Output:**

```
[3, 4, 5, 1, 2]
```

**Explanation:**
After rotating the array left by 2 positions, the first two elements are moved to the end.

---

### Example 2:

**Input:**

```
arr = [10, 20, 30, 40]
k = 1
```

**Output:**

```
[20, 30, 40, 10]
```

---

## Constraints

- `1 <= arr.length <= 10^5`
- `0 <= k <= 10^5`
- `-10^4 <= arr[i] <= 10^4`

---
