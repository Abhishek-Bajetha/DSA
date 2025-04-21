---
### File Name Suggestion: `RightRotateArrayByK.java`
---

# Right Rotate the Array by K Positions

## Problem Statement

Given an array of integers and a non-negative integer `k`, rotate the array to the **right by `k` positions**. This means that each element in the array will move `k` places to the right, and the elements that fall off the end will reappear at the beginning in the same order.

Try to perform the rotation **in-place**, modifying the original array without using extra space.

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
[4, 5, 1, 2, 3]
```

**Explanation:**
After rotating the array right by 2 positions, the last two elements move to the beginning.

---

### Example 2:

**Input:**

```
arr = [10, 20, 30, 40]
k = 1
```

**Output:**

```
[40, 10, 20, 30]
```

---

## Constraints

- `1 <= arr.length <= 10^5`
- `0 <= k <= 10^5`
- `-10^4 <= arr[i] <= 10^4`

---
