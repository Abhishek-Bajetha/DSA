---
# Union of Two Sorted Arrays

## Problem Statement

You are given two sorted arrays `arr1` and `arr2`. Your task is to find their **union**. The union of two arrays includes all distinct elements from both arrays in sorted order.

Ensure that the final result does not contain duplicates, even if the original arrays do.
---

## Examples

### Example 1:

**Input:**

```
arr1 = [1, 2, 4, 5]
arr2 = [2, 3, 5, 6]
```

**Output:**

```
[1, 2, 3, 4, 5, 6]
```

**Explanation:**
The distinct elements from both arrays in sorted order are included.

---

### Example 2:

**Input:**

```
arr1 = [1, 1, 2, 2]
arr2 = [2, 3, 3]
```

**Output:**

```
[1, 2, 3]
```

**Explanation:**
Only distinct elements from both arrays are added once.

---

## Constraints

- `1 <= arr1.length, arr2.length <= 10^5`
- `1 <= arr1[i], arr2[i] <= 10^9`
- Arrays are already sorted in non-decreasing order.

---
