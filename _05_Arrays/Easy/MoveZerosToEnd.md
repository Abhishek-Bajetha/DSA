---

# All Zeros at the End of the Array

## Problem Statement

Given an array of integers, your task is to move all the `0` values to the **end of the array**, while maintaining the relative order of the non-zero elements.

The operation should be performed **in-place**, without using extra space for another array.

---

## Examples

### Example 1:

**Input:**
```
arr = [0, 1, 0, 3, 12]
```

**Output:**
```
[1, 3, 12, 0, 0]
```

**Explanation:**
All non-zero elements have been shifted to the front, and all zeroes are moved to the end in their relative order.

---

### Example 2:

**Input:**
```
arr = [1, 0, 2, 0, 4, 0]
```

**Output:**
```
[1, 2, 4, 0, 0, 0]
```

---

## Constraints

- `1 <= arr.length <= 10^5`
- `-10^9 <= arr[i] <= 10^9`

---
