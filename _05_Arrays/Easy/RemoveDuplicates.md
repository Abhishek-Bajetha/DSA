---
# Remove Duplicate Values from a Sorted Array

## Problem Statement

Given a **sorted array** of integers, remove all duplicate elements **in-place** such that each element appears **only once**, and return the new length of the array.

You must perform this operation **without using any extra space** (i.e., in-place). After removing duplicates, the first part of the array should contain the unique elements in the same order.

You don’t need to return the modified array, just the count of unique elements. However, for clarity, the array should still be updated to reflect the removal of duplicates.
---

## Examples

### Example 1:

**Input:**

```
arr = [1, 1, 2]
```

**Output:**

```
2
```

**Explanation:**
The array after removing duplicates: `[1, 2, _]`, where `_` can be any value. The first two elements are unique.

---

### Example 2:

**Input:**

```
arr = [0,0,1,1,1,2,2,3,3,4]
```

**Output:**

```
5
```

**Explanation:**
The array after removing duplicates: `[0,1,2,3,4,_,_,_,_,_]`. First 5 elements are unique.

---

## Constraints

- `1 <= arr.length <= 10^5`
- `-10^4 <= arr[i] <= 10^4`
- The array is sorted in **non-decreasing** order.

---
