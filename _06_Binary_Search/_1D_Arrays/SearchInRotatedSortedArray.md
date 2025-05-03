---

# Search in Rotated Sorted Array

## Problem Statement

Given a sorted array that has been rotated at an unknown pivot, and a target value, write a function to search for the target in the array. If the target exists, return its index. Otherwise, return -1.

The array contains **distinct** integers and was originally sorted in **ascending** order before rotation.

Try to use a modified binary search approach to achieve efficient performance.

## Example

### Example 1:

**Input:**

```
arr = [4, 5, 6, 7, 0, 1, 2], target = 0
```

**Output:**

```
4
```

### Example 2:

**Input:**

```
arr = [4, 5, 6, 7, 0, 1, 2], target = 3
```

**Output:**

```
-1
```

## Constraints

* `1 <= arr.length <= 10^5`
* `-10^9 <= arr[i], target <= 10^9`
* All elements in the array are unique.

---
