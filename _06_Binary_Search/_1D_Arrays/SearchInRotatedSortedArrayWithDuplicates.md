---

# Search in Rotated Sorted Array with Duplicates

## Problem Statement

You are given a rotated sorted array of integers that **may contain duplicates**, and a target value. Determine whether the target exists in the array or not.

You must return `true` if the target is found in the array, otherwise return `false`.

This is an extension of the rotated binary search problem where additional care is needed to handle duplicate values during the binary search process.

## Example

### Example 1:

**Input:**

```
arr = [2, 5, 6, 0, 0, 1, 2], target = 0
```

**Output:**

```
true
```

### Example 2:

**Input:**

```
arr = [2, 5, 6, 0, 0, 1, 2], target = 3
```

**Output:**

```
false
```

## Constraints

* `1 <= arr.length <= 10^5`
* `-10^9 <= arr[i], target <= 10^9`

---
