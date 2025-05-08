---

# Count Rotations in a Sorted Rotated Array

## Problem Statement

You are given a **sorted and rotated** array. Your task is to determine how many times the array has been rotated.

In other words, find the index of the minimum element. The number of rotations is equal to the index of the smallest element in the array.

Assume there are **no duplicate elements** in the array.

## Example

### Example 1:

**Input:**

```
arr = [15, 18, 2, 3, 6, 12]
```

**Output:**

```
2
```

**Explanation:**
The original sorted array was \[2, 3, 6, 12, 15, 18]. It has been rotated 2 times.

### Example 2:

**Input:**

```
arr = [7, 9, 11, 12, 5]
```

**Output:**

```
4
```

## Constraints

* `1 <= arr.length <= 10^5`
* `-10^9 <= arr[i] <= 10^9`

---
