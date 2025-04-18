---

# Binary Search in 1D Array

## Problem Statement

Given a sorted array of integers and a target value, implement **Binary Search** to find whether the target exists in the array.

Return the index of the target value if it exists, otherwise return -1.

You must use the binary search technique (i.e., divide and conquer). Do not use any built-in method like `Arrays.binarySearch()`.

## Examples

### Example 1:

**Input:**
```
arr = [1, 3, 5, 7, 9, 11]
target = 7
```

**Output:**
```
3
```

**Explanation:**
Element `7` is found at index `3`.

---

### Example 2:

**Input:**

```
arr = [2, 4, 6, 8, 10]
target = 5
```

**Output:**

```
-1
```

**Explanation:**
Element `5` is not present in the array.

---

### Example 3:

**Input:**

```
arr = [0]
target = 0
```

**Output:**

```
0
```

**Explanation:**
The only element matches the target.

---

## Constraints

- `1 <= arr.length <= 10^5`
- `-10^9 <= arr[i], target <= 10^9`
- `arr` is sorted in non-decreasing order.

---
